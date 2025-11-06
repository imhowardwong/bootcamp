public class Candy {
  private String color;
  private int quantity;
  
  public Candy (String color, int quantity){
    this.color = color;
    this.quantity = quantity;
  }

  public String getColor(){
    return this.color;
  }
  public int countQuantity(){
    return this.quantity;
  }
  public void setColor(String color){
    this.color = color;
  }
    public void setQuantity(int quantity){
    this.quantity = quantity;
  }
}
