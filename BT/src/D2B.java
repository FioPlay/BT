
public class D2B {

	public static void main(String[] args) {
		
		String B = "100101001010010101";
		Bit2Dez(B);
		
	}
	
	public static int Bit2Dez(String Bin�rZ) {
		
		char[] Bin�rArray = Bin�rZ.toCharArray();
		int[] Bin�rZArray = new int[Bin�rArray.length];
		
		for (int i = 0; i < Bin�rZArray.length; i++) {
			Bin�rZArray[i] = Bin�rArray[Bin�rArray.length - i]; 
		}
		
		int Dez = 0;
		
		for (int i = 0; i < Bin�rZArray.length; i++) {
			if(Bin�rZArray[i] == 1) {
				
			}else if(Bin�rZArray[i] == 1) {
				
			}else {
				
			}
		}
		
		return Dez;
	}

}
