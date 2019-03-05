package joseph.study.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
	public static void main(String[] args) {
		CallableDemo demo = new CallableDemo();
		FutureTask<Integer> task = new FutureTask<>(demo);
		new Thread(task).start();

		try {
			Integer result = task.get();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
