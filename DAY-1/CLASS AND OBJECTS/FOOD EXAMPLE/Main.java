import java.util.*;

public class Main {
    public static void main(String[] args) {
        Order firstorder=new Order("101","venkat");
        firstorder.addItem("apples",500);
        firstorder.placeOrder();
        firstorder.displayDetails();
        firstorder.addItem("orange",500);
    }
} 