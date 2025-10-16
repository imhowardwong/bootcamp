public class ExInt {
  public static void main(String [] args) {
    // int double (data type - primitive)
    //variable, declaration, assignemnt
    // print variable
    // math operation

    int appleCount = 9;
    double applePrice = 5.5;
    int orangeCount = 4;
    double orangePrice = 6.5;
    double discount = 0.95;

    double finalAmount = (appleCount * applePrice + orangeCount * orangePrice) * discount;
    System.out.println(finalAmount);

  }
  
}
