import java.util.*;

public class Order {

    /**A food delivery app needs to manage orders.

Each order belongs to a customer, contains a list of food items with prices, and tracks whether it has been placed. Customers build their order by adding items one at a time, and once they're satisfied, they place the order. After that, no more items can be added.

Without classes, you'd have separate arrays for order IDs, customer names, item lists, and totals with no clean way to enforce rules like "don't add items after placing."

With classes, the Order owns its data and enforces invariants: addItem() works only before place(), so invalid states are prevented by design.**/

 //attributes

 private String name;
 private String orderId;
 private List<String> items;
 private double totalPrice;
 private boolean orderplaced;

 public Order(String orderId,String name){
    this.orderId = orderId;
    this.name = name;
    this.items = new ArrayList<>();
    this.totalPrice = 0.0;
    this.orderplaced = false;
 }
// Here we are checking whether the order is placed or not --> if place not able to add item 
 public void addItem(String Item,double price){
    if(orderplaced){
        System.out.println("Sorry your order placed.You can't add the items");
        return;
    }
    items.add(Item);
    totalPrice+=price;
 }

 // user can placeorder if he not placed and item should atleast one 

 public boolean placeOrder(){
    if(orderplaced || items.isEmpty()){
        return false;
    } 
    orderplaced=true;
    return true;
 }

 //display the order details 

 public void displayDetails(){
    String status = orderplaced ? "Yes" : "Pending";
    System.out.println("Order id : "+orderId+" Customer name : "+name+" order status : "+status);
    for (String item : items) {
        System.out.println(item + "-");
    }
    System.out.println("Total bill : "+totalPrice);

 }  
}
