public class Dog {
  private String name;
  private Dog dog;
  private void setNextDog(Dog newDog){
    this.dog = newDog;
  }

  public Dog(String name){
    this.name = name;
  }
  // remove(int index) dog -> dog -> dog
  public void remove(Dog dog){
    Dog currentDog = this;
    for (Dog dogs : dog){
      if (currentDog == dogs){
        dogs.remove(currentDog);
      }
    }
  }
  public void add(Dog newDog){
    // Find the last one (getDog -> null, then setDog(newDog))
    Dog currentDog = this;
    while(currentDog != null){
      if(currentDog.getNextDog() == null){
        currentDog.setNextDog(newDog); 
        break;
    }
      currentDog = currentDog.getNextDog();
    }
  }

  public String getName(){
    return this.name;
  }
  public Dog getNextDog(){
    return this.dog;
  }

  public int size(){
    //loop linkedlist structer
    Dog currentDog = this;
    int count =0;
    while(currentDog != null){
      count++;
      currentDog = currentDog.getNextDog();
    }
    return count;
  }
  public static void main(String[] args) {
    Dog d1 = new Dog("Jonny");
    d1.add(new Dog ("Mary"));
    System.out.println(d1.getNextDog().getName()); // Mary
    System.out.println(d1.getNextDog().getNextDog());  // null
    System.out.println(d1.size()); //2

    d1.add(new Dog ("Tommy"));
    System.out.println(d1.getNextDog().getNextDog().getName());
    System.out.println(d1.size());
    d1.add(new Dog ("Billy"));
    System.out.println(d1.getNextDog().getNextDog().getNextDog().getName());
  }
}