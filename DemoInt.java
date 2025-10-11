public class DemoInt{
  public static void main(String [] args) {
    int x = 3;

    System.out.println(x); //3

    int y = 10;

    System.out.println(y);

    //declaration
    int a;
    int k;

    //Assignment
    a = 100;
    k = 20;

    int total = x + y;
    System.out.println(total);

    int baseSalary = 20000;
    int bonus = 5000;
    int totalSalary = baseSalary + bonus;
    System.out.println(totalSalary);

    //discount
    int price = 150;
    // Naming convension (camel case)
    double discountRate = 0.8;
    //! Math Operation: 
    // 1. int + int -> int
    //2. int + double -> double
    //3. double + double -> double
    // ie 1.0 + 4 = 5.0
    // 1 + 4 = 5
    // ! We cannot assign double value into an int variable
    double finalPrice = price * discountRate;
    System.out.println(finalPrice);

    int finalPrice2 = price * 80/100;
    System.out.println(finalPrice2);

    int englishScore = 82;
    int mathScore = 91;
    int historyScore = 83;

    //! (int + int + int) / int -> int
    double averageScore = (englishScore + mathScore + historyScore) / 3.0;
    System.out.println(averageScore);

    int appleCount = 9;
    double applePrice = 5.5;
    int orangeCount = 4;
    double orangePrice = 6.5;
    double discount = 0.95;

    double finalAmount = (appleCount * applePrice) + (orangeCount * orangePrice) * discount;
    System.out.println(finalAmount);
  }
}