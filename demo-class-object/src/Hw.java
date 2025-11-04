public class Hw {
  public static void main(String[] args) {

    System.out.println("I am going to add two numbers together:");
    int first = 31;
    // declare the second one
    // code here ...
    int second = 32;

    System.out.println("The first one: " + first);
    System.out.println("The second one: " + second);

    // Add two numbers and print it out
    // code here ...
    int sum = first + second;
    System.out.println("The sum is " + sum);

    // subtraction
    // code here with tips, pls fix ...
    // subtract = first - second
    int subtract = first - second;
    System.out.println("The subtraction reuslt is " + subtract);

    // another sum
    byte b1 = 60;
    byte b2 = 70;
    // code here with tips, pls fix ...
    int sum1 = b1 + b2;
    // sum = b1 + b2;
    System.out.println("The another sum reuslt is " + sum1);

    // declare two boolean variable with true and false value
    // code here
    int age = 20;
    boolean varB = age >=18;
    boolean varC = age <= 25;
    System.out.println("The variable varB is " + varB);
    System.out.println("The variable varC is " + varC);

    // Reading Example
    float fnumber = -130.20f; // By default, numbers are treated as double in Java.
    // Use suffix 'f' with value to make it float.
    double dnumber = -20.50;
    System.out.println("The variable fnumber is " + fnumber);
    System.out.println("The variable dnumber is " + dnumber);

    // Find reminder. Declare variable a & reminder
    int a = 7;
    int b = 3;
    // Fix it ...
    int remainder = a % b;
    System.out.println("The variable remainder is " + remainder);

    // declare a variable x and assign value to it.
    int e = 7;
    int o = 8;
    int y = 4;
    // code here ... define the x and assign value to it
    int result = e - o * x / y;
    System.out.println("The result is " + result);
}
}
