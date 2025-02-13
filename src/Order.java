import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private String dishes;
    ArrayList<Dish> dish = new ArrayList<>();

    public Order(int orderNumber, String dishes) {
        this.orderNumber = orderNumber;
        this.dishes = dishes;
    }

    public void String(Dish dish) {
        this.dish.add(dish);
    }

    public void calculateTotal() {
        double total = 0;
        for (Dish dish : dish) {
            total += dish.getPrice();
        }
        System.out.println("Total: " + total);
    }

    public void showOrder() {
        System.out.println("Order number: " + orderNumber);
        for (Dish dish : dish) {
            System.out.println(dish.getName() + " - " + dish.getPrice());
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", dishes='" + dishes + '\'' +
                '}';
    }
}
