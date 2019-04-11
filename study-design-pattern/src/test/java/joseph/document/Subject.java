package joseph.document;

public interface Subject {

	public void addObserver(Observer observer);
	public void delObserver(Observer observer);
	public void clearObserver();
	public void notifyAllObserver();
	public void operate();
}
