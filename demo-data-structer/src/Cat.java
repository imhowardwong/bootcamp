import java.util.Objects;

public class Cat {
  private String name;

  public Cat(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  // if not override, using Object.class equals() -> object address
  //if overrider like the below, imply they are the same
  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat c1 = (Cat) obj;
    return Objects.equals(this.name, c1.getName());
  }
  @Override
  public String toString(){
    return "Cat("//
    + "name=" + this.name //
    + ")";
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

}
