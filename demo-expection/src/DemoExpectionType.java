import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoExpectionType {
  public static void main(String[] args) throws IllegalAccessException {
    //Example 1
    int count = 0;
    try{
      double average = 10/count; //shoud use if-else
      System.out.println(average);
    } catch (ArithmeticException e){
      System.out.println("Can't / by zero.");
    }
    // System.out.println(10/0);  // / by zero
    
    
    //Example 2
    // array
    int [] arr = new int[2];
    arr[0] = 100;
    arr[1] = 300;

    int idx = 2;
    try{
      arr[idx] = 1000;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index But of Bound.");
    }

    //Example 3
    try{
      String s = "hello";
      s.charAt(s.length());
    } catch (StringIndexOutOfBoundsException e){
      System.out.println("String Index Out of Bound.");
    }

    //Example 4 NPE(Null Pointer Expection)
    try{
      lastChar("hello"); //ok
      // lastChar(null); //runtime error, NullPointerException
      // lastChar(""); //runtime error, ArrayIndexOutOfBoundsException
    } catch(NullPointerException e){
      System.out.println("Null Pointer Exception."); //catch either one
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Array Index Out Of Bounds.");
    }
    // 6. IllegealArgumentException (IAE)
    try{
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please input the age:");
      int age = scanner.nextInt();
      double fee = calculateFee(age);
    } catch (IllegalArgumentException e){
      System.out.println("Calculate Fee Process Error" + e.getMessage());
    }
    //send email to customer
    //fall back
    //return debit amount the credit card
    try{
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);
    } catch (FileNotFoundException e){
      System.out.println("No file found!");
    }
    //! Method A -> Method B
  }
  public static double calculateFee(int age) throws IllegalAccessException{
    if (age<0)
      throw new IllegalAccessException("Age should be >=0.");
    if (age>65)
      return 2;
    return 10;

  }
  public static char lastChar(String s){
    return s.charAt(s.length()-1);
  }
}
