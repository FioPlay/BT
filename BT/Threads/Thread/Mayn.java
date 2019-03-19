package Thread;

public class Mayn {

	public static void main(String[] args) {
		Integer counter = 0;
		
		ThreadsPlus t1 = new ThreadsPlus("erster Fred",counter);
		ThreadsPlus t2 = new ThreadsPlus("zweiter Fred",counter);
		
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
