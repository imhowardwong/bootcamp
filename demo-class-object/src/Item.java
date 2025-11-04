public class Item {
  private double price;
  private int quantity;
  private String name;

  public Item(String name, double price, int quantity){
    this.price = price;
    this.quantity = quantity;
    this.name = name;
  }
  public double getPrice (){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
  public String getName(){
    return name;
  }
  public double totalAmount(){
    return this.price*this.quantity;
  }

}
