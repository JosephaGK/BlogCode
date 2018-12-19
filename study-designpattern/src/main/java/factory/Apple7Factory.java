package factory;

public class Apple7Factory implements AppleFactory {
	@Override public Apple getAppleIphone() {
		return new Apple7("seven");
	}
}
