public class DemoPrimitiveII {
  public static void main(String[] args) {
    //overflow
    short s1 = 30000;
    short s2 = 31000;
    short s3 = (short) (s1+s2); //short+short=int, byte+byte=int, byte+short=int

    System.out.println(s3); //-4xxx
    // 32xxx + 1 = -32xxx


    //! Promotion
    // byte->short->int->long->float->double
    byte b1 = 10;
    short s4 = b1;
    int i1 = s4;
    long l1 = i1;
    float f1 = l1;
    double d10 = f1;

    // ! downcasting
    float f2 = (float) 10.5;
    long l2 = 2_200_000_000L;
    int i2 = (int) l2; //confirmed the risk
    System.out.println(i2); //-2094967296


    //cahr->int


  }
  
}
