import java.math.BigDecimal;

public class Customer {
  // Customer has many orders, a order has many items
  // Item : quantity x price, name
  private Order[] orders;

  public Customer (){
    this.orders = new Order[0];
  }
//!Presentation
  //isVip -> total amount of all orders >= 10000
  public boolean isVip(){
    BigDecimal total = BigDecimal.ZERO;
    for (Order orders : this.orders){
      total = total.add(BigDecimal.valueOf(orders.totalAmount()));
    }
    return total.doubleValue()>=10000;
    }
  // }

  public void addOrder(Order newOrder){
    Order [] newOrders = new Order[this.orders.length+1];
    int idx = 0;
    for (Order orders : this.orders){
      newOrders[idx++] = newOrder;
    }
    newOrders[idx]=newOrder;
    this.orders = newOrders;
  }

  //Classes : Customer, Order, Item, Quantity, Price

  public static void main(String[] args) {
    // Place item into shipping cart
    // checkout -> new order (total amount)
    Order o1 = new Order();
    o1.addItem(new Item("ABC", 2.5, 3));
    o1.addItem(new Item("DEF", 9.9, 10));
    o1.addItem(new Item("HIJ", 999.9, 2));

    //order total amount?
    System.out.println(o1.totalAmount());

    //given Item name, find subtotal
    //"DEF" -> 99.9(9.9*10)
    System.out.println(o1.getSubtotal("DEF")); //99.0
    
    Customer c1 = new Customer();
    c1.addOrder(o1);
    o1.addItem(new Item("XYZ", 9000, 1));
    System.out.println(c1.isVip()); //true
  }
}
