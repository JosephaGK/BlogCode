package study.mybatis.bean.ext;

import lombok.Data;
import study.mybatis.bean.auto.Tree;

import java.io.Serializable;
import java.util.List;

/**
 * @author Joseph
 */
@Data
public class TreeModel extends Tree implements Serializable {

	private static final long serialVersionUID = -1904718634471791900L;

	private List<TreeModel> children;

	private Integer dept;

	public TreeModel(Integer id,String treeTitle,String treeCd,String treePcd){
		this.setId(id);
		this.setTreeTitle(treeTitle);
		this.setTreeCd(treeCd);
		this.setTreePcd(treePcd);
	}

	public TreeModel(){

	}



}
