package snippet;

public class Snippet {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Deine umzuwandelnde Binärzahl:");
			Scanner sc = new Scanner(System.in);
			String binär = sc.next();
			 	char[] stellen = binär.toCharArray();
				int a = 0;
				int dez=0;
				for (int i = stellen.length-1; i >= 0; i--) {
						if (Integer.parseInt(String.copyValueOf(stellen,i,1))==1) a = 2;
						else a = 0;
							dez = dez + (int)Math.pow(a, stellen.length-1-i);
				}
				System.out.println("Die Dezimalzahl aus der Binärzahl "+binär+" ist "+dez);
		}
	
}

