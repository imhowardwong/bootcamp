public class Box3<T extends Animal> { //Class's T definition applies the type of object and its instance method
  private T value;
  
public Box3 (T value){
  this.value = value;
}
public static void main(String[] args) {
  Box3<Animal> animalBox = new Box3<>(new Cat()); 
  Box3<Cat> animalBox2 = new Box3<>(new Cat()); 
  Box3<Dog> animalBox3 = new Box3<>(new Dog()); 
  }
}
