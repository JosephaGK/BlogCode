package factory;

public class Apple8 extends AbstractApple {
	public Apple8(String name) {
		this.name=name;
	}

	@Override public void call() {
		super.call();
		System.out.println("apple " + name + " call");
	}
}
