package structure.proxy2.proxy.staticproxy;
public class  $Proxy0 implements structure.proxy2.proxy.staticproxy.Moveable {
	private structure.proxy2.proxy.staticproxy.Moveable moveable;
	public $Proxy0(structure.proxy2.proxy.staticproxy.Moveable moveable) {
		this.moveable= moveable;
	}
	@Override public void move() {
		System.out.println("汽车开始行驶时间:"+ System.currentTimeMillis());
		moveable.move();
		System.out.println("汽车结束行驶时间:"+ System.currentTimeMillis());
	}
}