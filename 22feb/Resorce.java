package newproject;

public class Resorce {

	public void display(String name) {
		for (int i = 1; i <= 5; i++) {

			System.out.println("NAME COUNT:" + i + "-" + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
