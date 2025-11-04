public class DemoIf {
  public static void main(String[] args) {
    int x = 3;
    if (x > 10) {
      System.out.println("hello");
    } else {
      System.out.println("Goodbye");
    }
  
  
    // and or
    {int y = 10;
    if (x > 2 && y <20){ // true and true -> true
      System.out.println("hello");
    }
    

    if (x > 4 && y <20) {
      System.out.println("abc");
       {
        System.out.println("jdk");
      }
    }
    }

    //example : max, min
    int num1 =10;
    int num2 = 12;
    int min =0;
    int max=0;
    if (num1>num2){
      max = num1;
      min = num2;
    } else {
      max = num2;
      min = num1;
    } 
    System.err.println("max="+max + ", min="+min); //max = 12, min=10

    //if-else
    //score >=90, Grade A
    //score >= 80, Grade B
    //score >= 70, Grade C
    // score <70, Fail

    int score = 77;
    char grade = 'F';
    if (score >= 90){
      grade = 'A';
    } else if (score >= 80 && score < 90){
      grade = 'B';
    } else if (score >= 70 && score < 80){
      grade = 'C';
    }
    System.out.println("Grade=" + grade);




}
}