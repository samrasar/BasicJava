package producerConsumer;

public class Main {

	public static void main(String[] args) {
		Company C =new Company();
		Producer P =new Producer(C);
		Consumer Co=new Consumer(C);
		P.start();
		Co.start();
	}

}
