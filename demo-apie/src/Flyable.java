// contract 合約
public interface Flyable {
// interface must be verb, noun using parent&child

  public static int counter = 0;
public static int sum(int x, int y){
  return x+y;
}

//This is also a part of the contract
  default void run(){
    System.out.println("This is default run method in the Interface");
  }
  default void drinks(){
    
  }
  //! Interface 
  // - NO attribute
  // - NO constructor
  // - abstract method(No concerte method)
  // - One interface can be with more than one abstract method
  // - can be with static variable
  // - can be with static method

  // implicitly adstract method
  void fly();
  // void walk(); its ok
}
