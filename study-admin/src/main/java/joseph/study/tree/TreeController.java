package joseph.study.tree;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import study.mybatis.bean.ext.TreeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tree")
public class TreeController {

	public static Map<String,TreeModel> nodes = new HashedMap();
	static {
		//模拟数据库存储树结构
		nodes.put("1",new TreeModel(1,"root","1","0"));
		nodes.put("2",new TreeModel(2,"a","2","1"));
		nodes.put("3",new TreeModel(3,"b","3","1"));
		nodes.put("4",new TreeModel(4,"c","4","1"));
		nodes.put("5",new TreeModel(5,"d","5","2"));
		nodes.put("6",new TreeModel(6,"e","6","3"));
		nodes.put("7",new TreeModel(7,"f","7","4"));
		nodes.put("8",new TreeModel(8,"g","8","5"));
	}


	@RequestMapping("/getTree")
	@ResponseBody
	public JSONArray getTree(){
		return  getTreeJson("0",nodes);
//		return  JSON.toJSONString(getTreeJson("0",nodes));
	}

	public static void main(String[] args) {
		System.out.println("result:" + JSON.toJSONString(getTreeJson("0",nodes)));
	}

	/**
	 * 递归处理   数据库树结构数据->树形json
	 * @param treeCd
	 * @param nodes
	 * @return
	 */
	public static JSONArray getTreeJson(String treeCd, Map<String, TreeModel> nodes){

		//当前层级当前node对象
		TreeModel cur = nodes.get(treeCd);
		//当前层级当前点下的所有子节点（实战中不要慢慢去查,一次加载到集合然后慢慢处理）
		List<TreeModel> childList = getChildNodes(treeCd,nodes);

		JSONArray childTree = new JSONArray();
		for (TreeModel node : childList) {
			JSONObject o = new JSONObject();
			o.put("title", node.getTreeTitle());
			//递归调用该方法
			JSONArray childrens = getTreeJson(node.getTreeCd(),nodes);
			if(!childrens.isEmpty()) {
				o.put("children",childrens);
			}
			childTree.fluentAdd(o);
		}
		return childTree;
	}

	/**
	 * 获取当前节点的所有子节点
	 * @param treeCd
	 * @param nodes
	 * @return
	 */
	public static List<TreeModel> getChildNodes(String treeCd, Map<String,TreeModel> nodes){
		List<TreeModel> list = new ArrayList<>();
		for (String key : nodes.keySet() ) {
			if(nodes.get(key).getTreePcd().equals(treeCd)){
				list.add(nodes.get(key));
			}
		}
		return list;
	}

}
