package factory;

/**
 * @author Joseph
 */
public class Apple7 extends AbstractApple {

	public Apple7(String name) {
		this.name = name;
	}

	@Override public void call() {
		super.call();
		System.out.println("apple "+name+" call");
	}
}
