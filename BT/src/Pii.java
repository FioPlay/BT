

public class Pii { 
  public static void main(String[] args) {
    System.out.println(pi());
  } 
  public static double pi() {
    int zahl1 = 0;
    int zahlpi = 0;
    for (int i = 0; i < 1000000; i++) {
      double px = (Math.random() * 2 - 1);
      double py = (Math.random() * 2 - 1);
      if (Math.pow(px * px + py * py, 0.5) < 1) {
        zahlpi += 1;
        zahl1 += 1;
      } else {
        zahl1 += 1;
      } 
    }
    double pii = (zahlpi / (double)(zahl1)) * 4;
    return pii;
  }  
} 

