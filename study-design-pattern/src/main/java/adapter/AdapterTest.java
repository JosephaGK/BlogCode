package adapter;

public class AdapterTest {
	public static void main(String[] arg){
		ThreeSocketImpl threeSocket = new ThreeSocketImpl();
		ThreeSocketAdapter adapter = new ThreeSocketAdapter(new TwoSocketImpl());
		threeSocket.isThreeSocket();
		adapter.isThreeSocket();
	}
}
