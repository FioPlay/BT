
public class D2B {

	public static void main(String[] args) {
		
		String B = "11";
		System.out.println(Bit2Dez(B));
		
	}
	
	public static int Bit2Dez(String Bin�rZ) {
		
		char[] Bin�rArray = Bin�rZ.toCharArray();
		int[] Bin�rZArray = new int[Bin�rArray.length];
		
		for (int i = 0; i < Bin�rZArray.length; i++) {
			Bin�rZArray[i] = (int) (Bin�rArray[Bin�rArray.length - (i + 1)] - 48); 
		}
		
		int Dez = 0;
		
		for (int i = 0; i < Bin�rZArray.length; i++) {
			if(Bin�rZArray[i] == 1) {
				Dez += Math.pow(2, i);
			}else if(Bin�rZArray[i] == 0) {
				
			}else {
				System.out.println("Input ist keine Bin�rzahl");
				return 0;
			}
		}
		
		return Dez;
	}

}
