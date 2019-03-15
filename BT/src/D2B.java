
public class D2B {

	public static void main(String[] args) {
		
		String B = "100101001010010101";
		Bit2Dez(B);
		
	}
	
	public static int Bit2Dez(String BinärZ) {
		
		char[] BinärArray = BinärZ.toCharArray();
		int[] BinärZArray = new int[BinärArray.length];
		
		for (int i = 0; i < BinärZArray.length; i++) {
			BinärZArray[i] = BinärArray[BinärArray.length - i]; 
		}
		
		int Dez = 0;
		
		for (int i = 0; i < BinärZArray.length; i++) {
			if(BinärZArray[i] == 1) {
				
			}else if(BinärZArray[i] == 1) {
				
			}else {
				
			}
		}
		
		return Dez;
	}

}
