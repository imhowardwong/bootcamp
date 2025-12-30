import java.util.List;
import java.util.Vector;
//! Vector(thread safe) vs ArrayList (non-thread safe)

public class DemoVector {
  public static void main(String[] args) {
    List<String> names = new Vector<>();  
  
    Runnable task =()->{
      for(int i = 0; i<100000; i++){
        names.add("Leo");
      }
    };
    long before = System.currentTimeMillis();
    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);
    t1.start();
    t2.start();
    try{
      t1.join();
      t2.join();
    } catch (InterruptedException e){

    }
    long after = System.currentTimeMillis();
    long timeUsed = after - before;
    System.out.println("time used=" + timeUsed);
    System.out.println(names.size()); 
  }
}
