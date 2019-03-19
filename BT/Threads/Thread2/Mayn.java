package Thread2;

public class Mayn {

	public static void main(String[] args) {
		Blubb b = new Blubb();
		
		ThreadsPlus t1 = new ThreadsPlus("erster Fred", b , true);
		ThreadsPlus t2 = new ThreadsPlus("zweiter Fred", b , false);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ende des Programms");
	}

}
