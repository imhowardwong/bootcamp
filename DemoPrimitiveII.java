import java.util.Random;

public class DemoPrimitiveII {
  public static void main(String[] args) {
    //! overflow
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
    //'a' 97
    //'b' 98
    //'A' 65

    char c1 = 'a';
    System.out.println(c1 + 1); //98
    System.out.println('a'+'b'); //195
    System.out.println('!'+1); //34
    System.out.println(' ' + 1); //33
    System.out.println('你'+ 1); //20321

    int result = '你'+100;
    System.out.println(result); //20420


    //Math.random
    //new Random
    int r1 = new Random().nextInt(3); //0-2
    System.out.println("r1="+ r1);


    //marksix (1-49)
    int marksix = new Random().nextInt(49)+1;
    System.out.println("Marksix=" + marksix);


    //'a-z' (ascii code)(97-122)
    int asciiCode = new Random().nextInt(26)+97;
    System.out.println("ASCII CODE=" + (char) asciiCode);

    


  }
  
}
