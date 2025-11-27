import javax.swing.Box;

public class Box2 {
  private Animal animal;

  public Box2(Animal animal){
    this.animal = animal;
  }
  public void setAnimal(Animal animal){
    this.animal = animal;
  }
  public void askAnimalToEat(){
    this.animal.eat();
  }
  public static void main(String[] args) {
    //no generic
    Box2 animalBox = new Box2(new Cat());
    animalBox.askAnimalToEat();
    
    animalBox.setAnimal(new Dog());
    animalBox.askAnimalToEat();


  }
}
