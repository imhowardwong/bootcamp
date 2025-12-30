public class DemoThread2 {
  private int x =0;

  public void incremant(){
    this.x++;
  }
  public int getX(){
    return this.x;
  }
  
  public static void main(String[] args) {
    //! main Thread 
    int x =3;
    x++;
    System.out.println(x); //4
    x++;
    System.out.println(x); //5

    DemoThread2 d1 = new DemoThread2();
    
    //lambda
  Runnable task = () ->{
    for (int i =0; i< 100_000; i++){
      d1.incremant();
    }
  };
  //! t1 is second thread
  Thread t1 = new Thread(task); //assign task to thread
  //! t2 third thread
  Thread t2 = new Thread(task); //assign task to thread

  //! Main Thread release Thread t1
  t1.start(); // Thread t1 starts to execute task
  //! Main Thread release Thread t2
  t2.start(); // Thread t2 starts to execute task

  //Main Thread stand here to wait both t1 & t2 finish their task
  try{
    t1.join();
    t2.join();
  } catch (InterruptedException e){

  }

  //! Main Thread comes here after released t1 & t2
  System.out.println(d1.getX()); // not200_000
  //! Two problems:
  //1. t1 and t2 doing the same task, which is x++. they change value of the same memory slot
  //2.Main Thread continue execute the rest of code after reelase two threads
  }
  
}
