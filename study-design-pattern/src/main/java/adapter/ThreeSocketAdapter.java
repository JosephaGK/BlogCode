package adapter;

public class ThreeSocketAdapter implements ThreeSocket {
	private TwoSocket twoSocket;

	public ThreeSocketAdapter(TwoSocket twoSocket) {
		this.twoSocket = twoSocket;
	}
	@Override public void isThreeSocket() {
		twoSocket.isTwoSocket();
	}
}
