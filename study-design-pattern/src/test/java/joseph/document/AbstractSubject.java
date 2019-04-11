package joseph.document;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject{

	List<Observer> observerList = new ArrayList<>();

	@Override public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override public void delObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override public void clearObserver() {
		observerList.clear();
	}

	@Override public void notifyAllObserver() {
		for (Observer observer : observerList) {
			observer.doSomething();
		}
	}

	@Override public void operate() {

	}
}
