//! HashTable(thread safe) vs HashMap (non-thread safe)
// Table locked, map didnt
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>(); 
  
    Runnable task = ()->{
      for (int i = 0; i<100000;i++){
        map.put(i, i);
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
    System.out.println(map.size());
  }
  
}
