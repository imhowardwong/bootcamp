public class DemoMath {
  public static void main(String[] args) {
    double r = Math.pow(2, 4.0);
    System.out.println(r);

    System.out.println(Math.ceil(3.1)); //4.0
    System.out.println(Math.floor(3.1)); //3.0
    System.out.println(Math.PI); //3.141592653589793

    // In Java, we dont have short and byte value
    //assign int value into short variable
    short s1 = 1; //safe
    int x = 1;
    // short s2 = x; //unsafe (risky)

    long l1 = 100L;
    long l2 = 100; //promotion: int -> long

    float f1 = 1.5f;
    //float f2 = 1.5; //double value -> float variable (risky)
    double d1 = 1.5d;

    System.out.println(Math.abs(-3)); //3
    System.out.println(Math.abs(4)); //4
    System.out.println(Math.abs(3.0)); //3.0
    System.out.println(Math.abs(7.7f)); //7.7

    int score1 = 70;
    int score2 = 130;
    System.out.println(Math.max(0, score1)); //70
    System.out.println(Math.min(100, score2)); //100

    System.out.println(Math.round(0.234)); //0
    System.out.println(Math.round(0.634)); //1

    double d10 = 0.1235; //0.124
    System.out.println(Math.round(d10 * 1000)/1000.0);

    //double number = System.out.println(Math.random()); //random number (0-1)

  }
  
}
