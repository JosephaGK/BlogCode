package factory;

public class Apple8Factory implements AppleFactory {
	@Override public Apple getAppleIphone() {
		return new Apple8("eight");
	}
}
