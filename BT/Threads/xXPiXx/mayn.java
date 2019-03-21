package xXPiXx;

public class mayn {

	static double Pin = 0, counter = 0;

	public static void main(String[] args) {

		System.out.println("Starte Pi 1");
		System.out.println(Piold());
		System.out.println("Starte Pi 2");
		System.out.println(Pinew());

	}

	private static double Piold() {
		double Pi = 0;
		int anz = 0, durchl = 10000000;
		while (anz < durchl) {
			anz++;
			if (Math.pow(Math.random() * 2 - 1, 2) + Math.pow(Math.random() * 2 - 1, 2) < 1) {
				Pi++;
			}
		}
		return (Pi / durchl) * 4;
	}

	private static double Pinew() {
		Pin = 0;
		int durchl = 100;
		Pithreader[] t = new Pithreader[durchl];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Pithreader();
			t[i].start();
		}
		while (counter < durchl) {
			//durchl--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return (Pin / (durchl * 10000)) * 4;
	}

}
