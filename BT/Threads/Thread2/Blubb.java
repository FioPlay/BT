package Thread2;

public class Blubb {
	boolean flag = false;

	public synchronized void first() {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Ich bin der erste");
		flag = true;
		notify();
	}

	public synchronized void second() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Ich bin der zweite");
		flag = false;
		notify();
	}
}
