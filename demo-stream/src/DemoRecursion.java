public class DemoRecursion {
  public static void main(String[] args) {
    // n = 100
    // 1 + 2 + 3 + 4 + 5 ... + 100
    
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.println(sum); // 5050

    System.out.println(sum(100)); // 5050

    // Positive Numbers: 2 + 4 + 6 + ... + n
    System.out.println(sum2(10)); // 30

    order(new String[] {"John", "Steven", "Mary"});
  }

  public static int sum2(int n) {
    if (n <= 2)
      return n;
    return n + sum2(n - 2);
  }

  // ! Tail Recursion (method call itself)
  public static int sum(int n) {
    // ! Exit Criteria
    if (n <= 1)
      return 1;
    return n + sum(n - 1); // ! call itself
  }
  // 100 + sum(99)
  // 99 + sum(98)
  // ...
  // 2 + sum(1)
  // return 1

  public static void order(String[] customers) {
    // index 
    int idx = customers.length - 1;
    order(customers, idx);
  }

  // ! Non-Tail Recursion
  public static void order(String[] customers, int idx) {
    if (idx < 0)
      return;
    // ! confirm order
    System.out.println("Confirm Order for " + customers[idx]);
    // ! recursion
    order(customers, idx - 1); // 2 - 1 1 - 1
    // ! send email
    System.out.println("Send Email for " + customers[idx]);
  }


}