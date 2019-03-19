package Thread;

public class ThreadsPlus extends Thread {
	String name;
	Integer counter;

	ThreadsPlus(String s, Integer counter) {
		this.name = s;
		this.counter = counter;
	}

	public void run() {
		System.out.println("Starte Thread " + name);
		synchronized (counter) {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(100);
					System.out.println(counter++);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("Beende Thread " + name);
	}
}
