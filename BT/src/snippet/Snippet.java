package snippet;

public class Snippet {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Deine umzuwandelnde Bin�rzahl:");
			Scanner sc = new Scanner(System.in);
			String bin�r = sc.next();
			 	char[] stellen = bin�r.toCharArray();
				int a = 0;
				int dez=0;
				for (int i = stellen.length-1; i >= 0; i--) {
						if (Integer.parseInt(String.copyValueOf(stellen,i,1))==1) a = 2;
						else a = 0;
							dez = dez + (int)Math.pow(a, stellen.length-1-i);
				}
				System.out.println("Die Dezimalzahl aus der Bin�rzahl "+bin�r+" ist "+dez);
		}
	
}

