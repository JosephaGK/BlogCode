package proxy.staticproxy;

/**
 * 使用继承的方式实现代理，直接继承自代理类
 */
public class ExtendsStaticProxy extends Car{
	@Override public void move() {
		System.out.println("汽车开始行驶时间:"+ System.currentTimeMillis());
		super.move();
		System.out.println("汽车结束行驶时间:"+ System.currentTimeMillis());
	}
}
