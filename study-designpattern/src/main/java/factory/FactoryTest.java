package factory;

public class FactoryTest {
	public static void main(String[] arg){
		Apple apple7 = new Apple7Factory().getAppleIphone();
		Apple apple8 = new Apple8Factory().getAppleIphone();
		apple7.call();
		apple8.call();
	}
}
