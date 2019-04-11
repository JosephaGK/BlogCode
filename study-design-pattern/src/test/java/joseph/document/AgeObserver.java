package joseph.document;

public class AgeObserver implements Observer {
	@Override public void doSomething() {
		System.out.println("ageobserver notify");
	}
}
