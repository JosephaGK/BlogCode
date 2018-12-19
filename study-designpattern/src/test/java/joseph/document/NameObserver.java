package joseph.document;

public class NameObserver implements Observer {
	@Override public void doSomething() {
		System.out.println("nameObserver notify");
	}
}
