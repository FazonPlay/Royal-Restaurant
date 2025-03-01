import java.util.ArrayList;
import java.io.*;

public class Restaurant {
    private int id;
    private String name;
    private String address;
    Menu menu;
    private ArrayList<Employee> employees;
    private ArrayList<Order> orders;

    public Restaurant(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.menu = new Menu(1, "Menu", "2021-01-01", "Main");
        this.employees = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees of " + name + ":");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void showOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void saveOrdersToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/" + filename))) {
            for (Order o : orders) {
                writer.write(o.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

//    public void loadOrdersFromFile(String filename) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("Data/" + filename))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println("Loaded Order: " + line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error loading orders: " + e.getMessage());
//        }
//    }

    public void loadOrdersFromFile(String filename) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Data/" + filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains("Order{orderNumber")) {
                    int orderNumber = Integer.parseInt(line.substring(
                            line.indexOf("orderNumber=") + 12,
                            line.indexOf(", dishes=")
                    ));
                    Order order = new Order(orderNumber);
                    orders.add(order);
                    System.out.println("Loaded order: " + orderNumber);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading orders: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                ", employees=" + employees +
                ", orders=" + orders +
                '}';
    }
}
