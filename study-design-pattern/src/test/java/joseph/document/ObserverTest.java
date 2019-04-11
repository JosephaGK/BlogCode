package joseph.document;

public class ObserverTest {
	public static void main(String[] arg){
		Observer nameObserver = new NameObserver();
		Observer ageObserver = new AgeObserver();
		OneObject ob = new OneObject();
		ob.addObserver(nameObserver);
		ob.addObserver(ageObserver);
		ob.notifyAllObserver();
	}
}
