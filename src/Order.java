import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private ArrayList<Dish> dishes;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public double calculateTotal() {
        double total = 0;
        for (Dish dish : dishes) {
            total += dish.getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Order number: " + orderNumber);
        for (Dish dish : dishes) {
            System.out.println(dish.getName() + " - " + dish.getPrice());
        }
        System.out.println("Total: " + calculateTotal());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", dishes=" + dishes +
                '}';
    }
}
