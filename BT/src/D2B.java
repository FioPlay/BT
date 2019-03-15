
public class D2B {

	public static void main(String[] args) {
		
		String B = "100101001010010101";
		Bit2Dez(B);
		
	}
	
	public static int Bit2Dez(String BinärZ) {
		
		char[] BinärArray = BinärZ.toCharArray();
		int[] BinärZArray = new int[BinärArray.length];
		
		for (int i = 0; i < BinärZArray.length; i++) {
			BinärZArray[i] = (int)(BinärArray[BinärArray.length - (i + 1)]); 
		}
		
		int Dez = 0;
		
		for (int i = 0; i < BinärZArray.length; i++) {
			System.out.print(BinärZArray[i]);
			if(BinärZArray[i] == 1) {
				Dez += Math.pow(2, i);
			}else if(BinärZArray[i] == 0) {
				
			}else {
				System.out.println("Input ist keine Binärzahl");
				return 0;
			}
		}
		
		return Dez;
	}

}
