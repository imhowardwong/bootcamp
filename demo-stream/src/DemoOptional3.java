import java.util.Optional;

public class DemoOptional3 { // Cat has optional object, and optional object has name
  private Optional<String> name; //! wasting memory

  //! what is the problem of return null after getName()
  public Optional<String> getName(){
    return this.name;
  }

  public static void main(String[] args) {
    // Cat c1 = new Cat("Jenny");
    //if (c1.getNmae()!=null && c1.getName.equals("Jenny"))

    //! Summary : as developer, always do null check before using 
    //1. Avoid (null check)
    //2. Transfer (throw)
    

  }
}
