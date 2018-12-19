package observer;

public class OneSubject extends AbstractSubject {
	@Override
	public void operation() {
		System.out.println("test");
		notifyAllObservers();
	}
}
