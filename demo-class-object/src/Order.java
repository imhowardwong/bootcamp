import java.math.BigDecimal;

public class Order {
  private Item[] items;

  public Order(){
    this.items = new Item[0];
  }

  public int size(){
    return this.items.length;
  }

  public double getSubtotal(String itemName){
    for (Item item : this.items){
      if(item.getName().equals(itemName)){
        return item.totalAmount();
      }
    }
    return 0.0;
  }
  public void addItem(Item newItem){
    Item[] newItems = new Item[this.items.length+1];
    // copy the original items into the new array
    int idx = 0;
    for (Item items : this.items){
      newItems[idx++]=items;
    }
    newItems[idx] = newItem;
    this.items = newItems;
  }
  public double totalAmount(){
    BigDecimal total = BigDecimal.ZERO;
    for (Item items : this.items){
      total = total.add(BigDecimal.valueOf(items.totalAmount()));
    }
    return total.doubleValue();
  }
}
