package producerConsumer;

public class Producer extends Thread {
	Company c;

	public Producer(Company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			this.c.produce_item(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}
}
