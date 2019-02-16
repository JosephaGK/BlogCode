package proxy.staticproxy;

public class AggregationLogStaticProxy implements Moveable{
	private Moveable moveable;

	public AggregationLogStaticProxy(Moveable moveable) {
		this.moveable= moveable;
	}

	@Override public void move() {
		System.out.println("日志开始......");
		moveable.move();
		System.out.println("日志结束......");
	}
}
