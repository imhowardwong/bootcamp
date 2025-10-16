import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    System.out.println(Math.round(0.2 + 0.1)); // 0.30000000000000004
    System.out.println(0.1 * 0.2); // 0.020000000000000004
    System.out.println(0.3 / 0.1); // 2.9999999999999996

    System.out.println(0.3 + 0.1); // 0.4

    System.out.println(Math.round(0.2 + 0.1)); // 0

    // solution
    BigDecimal bd = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = bd.add(bd2);
    System.out.println(bd3.doubleValue()); // 0.3


    // subtract
    double x = 0.4;
    double y = 0.2;
    double result =
        BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
    System.out.println(result); //0.2

    double result2 =
        BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y)).doubleValue();
    System.out.println(result2); //0.08


    // divide (non-terminated decimal place)
    double e = 10.0;
    double f = 3.0;
    double result3 = BigDecimal.valueOf(e)
        .divide(BigDecimal.valueOf(f), 2, RoundingMode.HALF_UP) // Half = 5, half_up = 四捨五入, down = 5
        .doubleValue();
    System.out.println(result3); //3.33


  }

}
