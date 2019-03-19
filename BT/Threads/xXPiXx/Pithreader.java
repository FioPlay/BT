package xXPiXx;

public class Pithreader extends Thread {

	public void run() {
		int Pi = 0;
		for (int i = 0; i < 10000; i++) {
			if (Math.pow(Math.random() * 2 - 1, 2) + Math.pow(Math.random() * 2 - 1, 2) < 1) {
				Pi++;
			}
		}
		mayn.Pin += Pi;
		mayn.counter++;
	}

}
