package proxy.staticproxy;

/**
 * 使用聚合的方式实现静态代理，代理类持有被代理对象的引用
 */
public class  AggregationTimeStaticProxy implements Moveable{

	private Moveable moveable;

	public AggregationTimeStaticProxy(Moveable moveable) {
		this.moveable= moveable;
	}

	@Override public void move() {
		System.out.println("汽车开始行驶时间:"+ System.currentTimeMillis());
		moveable.move();
		System.out.println("汽车结束行驶时间:"+ System.currentTimeMillis());
	}
}
