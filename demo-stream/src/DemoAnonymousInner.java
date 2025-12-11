
public class DemoAnonymousInner {

  public static interface Flyable {
    void fly();
  }

  public static class Superman implements Flyable {
    @Override
    public void fly() {
      System.out.println("Superman is flying...");
    }
  }

  public static void main(String[] args) {
    Flyable s1 = new Superman();
    s1.fly();

    // Anonymous Inner Class
    Flyable s2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman is flying...");
      }
    };
    s2.fly();

  }
}
