
public class D2B {

	public static void main(String[] args) {
		
		String B = "11";
		System.out.println(Bit2Dez(B));
		
	}
	
	public static int Bit2Dez(String BinärZ) {
		
		char[] BinärArray = BinärZ.toCharArray();
		int[] BinärZArray = new int[BinärArray.length];
		
		for (int i = 0; i < BinärZArray.length; i++) {
			BinärZArray[i] = (int) (BinärArray[BinärArray.length - (i + 1)] - 48); 
		}
		
		int Dez = 0;
		
		for (int i = 0; i < BinärZArray.length; i++) {
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
