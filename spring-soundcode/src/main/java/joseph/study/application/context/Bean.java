package joseph.study.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Joseph
 */
public class Bean {
	public static void main(String[] arg){
		//读取bean.xml中的内容
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/conf/bean.xml");
		//创建bean的引用对象
		Person p = ctx.getBean("person",Person.class);
		System.out.println(p.toString());
	}
}
