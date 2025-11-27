public class Panda {
  private Color color;
  //! enum as parameter in constructor -> Encapsulation
  public Panda (Color color){
    this.color=color;
  }
  public Color getColor(){
    return this.color;
  }
  public static void main(String[] args) {
    Panda p1 = new Panda(Color.RED);
    Panda p2 = new Panda(Color.WHITE);
    Panda p3 = new Panda(Color.YELLOW);

    // check if p2 is RED?
    //! we use == for comparing enum value
    if (p2.getColor() == Color.RED){
      System.out.println("The Panda p2 is RED.");
    }
    Color color = Color.valueOf('R');
    System.out.println(color); //RED
  }
}
