import java.util.List;
import java.util.Vector;

import com.task.TaskAddItem;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		List<String> list = new Vector<String>();

		for (int i = 0; i < 10; i++) {
			new Thread(new TaskAddItem(list, i)).start();
		}

		Thread.sleep(2000);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " - " + list.get(i));
		}

	}
}
