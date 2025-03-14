package producerConsumer;

public class Consumer extends Thread {
	Company c;

	public Consumer(Company c) {
		this.c = c;
	}

	public void run() {
		while (true) {
			this.c.consume_item();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
