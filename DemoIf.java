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
}
}