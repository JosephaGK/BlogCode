package proxy.dynamicproxy.JDKDynamicProxy.simulation;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Method;

public class JDKDynamicProxySimulation {

	public static Object newProxyInstance(Class cls) throws Exception {
		//window系统中的换行符
		String rt = "\r\n";
		String methodStr = "";
		for (Method method : cls.getMethods()) {
			methodStr = "	@Override public void "+method.getName()+"() {"+rt+
						"		System.out.println(\"汽车开始行驶时间:\"+ System.currentTimeMillis());"+rt+
						"		moveable."+method.getName()+"();"+rt+
						"		System.out.println(\"汽车结束行驶时间:\"+ System.currentTimeMillis());"+rt+
						"	}";
		}
		String str =
			"package proxy.staticproxy;"+"\r\n"+
			"public class  $Proxy0 implements "+cls.getName()+" {"+rt+
			"	private "+cls.getName()+" moveable;"+rt+
			"	public $Proxy0("+cls.getName()+" moveable) {"+rt+
			"		this.moveable= moveable;"+rt+
			"	}"+rt+
			methodStr+"\r\n"+
			"}";
		//产生代理类的java文件
		String fileName = System.getProperty("user.dir")+"/$Proxy0.java";
		File file = new File(fileName);
		FileUtils.writeStringToFile(file,str);
		//编译
		//获取编译器
		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager standardFileManager = complier.getStandardFileManager(null, null, null);
		//获取文件
		Iterable units = standardFileManager.getJavaFileObjects(file);
		//编译任务
		JavaCompiler.CompilationTask task = complier.getTask(null, standardFileManager, null, null, null, units);
		//进行编译
		task.call();
		standardFileManager.close();
		return null;
	}
}
