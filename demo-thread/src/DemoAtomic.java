import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  private static final boolean True = false;

  public static void main(String[] args) {
    
  int x = 3;
  x++; //non-thread safe
  System.out.println(x); //4

  //原子性
  AtomicInteger y = new AtomicInteger(3);
  y.getAndAdd(1); //thread safe
  System.out.println(y);

  AtomicBoolean z = new AtomicBoolean();
  z.set(false);
  z.getAndSet(True);
  

  }
}
