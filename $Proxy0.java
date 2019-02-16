package proxy.staticproxy;
public class  $Proxy0 implements proxy.staticproxy.Moveable {
	private proxy.staticproxy.Moveable moveable;
	public $Proxy0(proxy.staticproxy.Moveable moveable) {
		this.moveable= moveable;
	}
	@Override public void move() {
		System.out.println("汽车开始行驶时间:"+ System.currentTimeMillis());
		moveable.move();
		System.out.println("汽车结束行驶时间:"+ System.currentTimeMillis());
	}
}