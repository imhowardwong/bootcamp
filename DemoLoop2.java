import java.math.BigDecimal;

public class DemoLoop2 {
  public static void main(String[] args) {
    //Basic
    for (int i =0; i<5; i++){
      System.out.println(i); // 0 1 2 3 4 
    }

    //while loop
    int count = 0;
    while (count < 5){
      System.out.println(count);  //0 1 2 3 4
      count++;
    }

    // Array
    double[] amounts = new double[4];
    amounts[0] = 10.5;
    amounts[1] = 100.9;
    amounts[2] = 24.222;
    amounts[3] = 1010.9;

    // for-each loop , only read cant write (simple presentation of loop)
    for (double x : amounts) { //! x is a copy of the value
      System.out.println(x);
      // x=100; //! wrong idea of write operation
    }

    // basic , can read and write (萬能)
    for (int i =0; i < amounts.length; i++){
      System.out.println(amounts[i]);
      // amounts[i] = 100; //! OK, write operation
    }

    //! Sum up value (Important)
    double total = 0.0;
    for (double x : amounts){
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(x)).doubleValue();
    }
    System.out.println("total="+total); //total=1146.522

  }
  
}
