public class DemoPrimitives {
  // raw type
  //8 primities (byte, short, int, long, float, double, char, boolean)
  //saving function
  // short cut : main
  public static void main(String[] args) {
    // ! Integer
    //int, long, short, byte
    int x = 3;
    System.out.println(x); //3 
    x =10; //re-assignment
    System.out.println(x); //10

    byte b1 = 3;
    byte b2 = 127; //max value of byte
    byte b3 = -128; //min value of byte

    short s1 = 32767;// max
    short s2 = -32768;// min

    //! by default, we use int fir 99% scenario
    int i1 = 2147483647; //max
    int i2 = -2147483648; //min

    //long
    //2^63 -1 .. max
    //-2^63   min

    //!Decimal
    //double, float

    //10.123456789 -> double value
    //double > float
    double d1 = 10.123456789;
    //! java (assign double value to float variable -> error)
    // float f1=10.123456789f -> float value
    float f1 = 10.123456789f;
    double d2 = 10.123456789f; // -> ok

    double d10 = 10.3; 
    //error, not beacaus of the actual value, but the type
    //float f10 = d10; //risky -> error, double 精度更高


    //! char
    char c1 = 'a';
    // 'a' is a char value
    //assign char value into char variable
    //single quote '' for cahr value
    String s10 = "a";
    char gender = 'F';
    char grade = 'A';

    System.out.println(gender == grade);
    // for primitives comparison, ==, >=, <=, !=. >.<

    int score =73;
    System.out.println(score>70);

    double savingAmount = 400.5;
    System.out.println(savingAmount >= 100);

    //boolean
    int age = 19;
    boolean isAudlt = age >= 18;
    // only true,false


  };
  
}
