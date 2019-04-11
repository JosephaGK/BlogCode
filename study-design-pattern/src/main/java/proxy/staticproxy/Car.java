package proxy.staticproxy;

public class Car implements Moveable {

	@Override public void move() {
		System.out.println("正在行驶");
	}
}
