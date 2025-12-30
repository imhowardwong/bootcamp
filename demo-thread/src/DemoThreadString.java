public class DemoThreadString {
  private String s = "";

  //! Fix (key)
  public synchronized void add(String str){
    this.s += str;
  }

  public String getS(){
    return this.s;
  }

  public static void main(String[] args) {
    DemoThreadString ts = new DemoThreadString();
    Runnable task = () ->{
      for (int i = 0; i< 100_000; i++){
        ts.add("a");
      }
    };
    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();
    
    try{
    t1.join();
    t2.join();
  } catch (InterruptedException e){

  }
    System.out.println(ts.getS().length()); //200_000
  }
}
