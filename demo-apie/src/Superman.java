public class Superman extends Human implements Flyable, Eatbale{

  // When you explicitly write down constructor, implies that you dont need empty constructor
  public Superman (double weight, double height){
    super(weight, height);
  }

  // Verb
  @Override // _> interface  -> @override
  public void fly(){
    System.out.println("Superman is flying...");
  }
  @Override
    public void eat(){
    System.out.println("Superman is eating...");
  }

  public static void main(String[] args) {
    Eatbale[] things = new Eatbale[2];
    //! Those class implemented Eatable, can be assigned into Eatable[]
    things [0] = new Superman(3.4, 71);
    things [1] = new Student("John");

    for (Eatbale e : things){
      e.eat();
    }
  }
}
