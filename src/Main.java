import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        boolean running = true;

        while (running) {
            Interface.printMainMenu();
            String choice = Interface.askForInput("Enter choice: ");

            switch (choice) {
                case "1": // Add a restaurant
                    int restaurantId = Integer.parseInt(Interface.askForInput("Enter restaurant ID: "));
                    String restaurantName = Interface.askForInput("Enter restaurant name: ");
                    String restaurantAddress = Interface.askForInput("Enter restaurant address: ");
                    restaurants.add(new Restaurant(restaurantId, restaurantName, restaurantAddress));
                    Interface.showMessage("Restaurant added!");
                    break;

                case "2": // Add an employee to a restaurant
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    Restaurant selectedRestaurant = selectRestaurant(restaurants);
                    int empId = Integer.parseInt(Interface.askForInput("Enter employee ID: "));
                    String empName = Interface.askForInput("Enter employee name: ");
                    String empSurname = Interface.askForInput("Enter employee surname: ");
                    String empRole = Interface.askForInput("Enter employee role: ");
                    String empHireDate = Interface.askForInput("Enter hire date (HH:mm:ss): ");
                    double empSalary = Double.parseDouble(Interface.askForInput("Enter employee salary: "));
                    selectedRestaurant.addEmployee(new Employee(empId, empName, empSurname, empRole, empHireDate, empSalary));
                    Interface.showMessage("Employee added!");
                    break;

                case "3": // Add a dish to a restaurant menu
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectedRestaurant = selectRestaurant(restaurants);
                    String dishName = Interface.askForInput("Enter dish name: ");
                    String dishDescription = Interface.askForInput("Enter dish description: ");
                    double dishPrice = Double.parseDouble(Interface.askForInput("Enter dish price: "));
                    String dishCalories = Interface.askForInput("Enter calories: ");
                    String dishCategory = Interface.askForInput("Enter category: ");
                    String dishPortionSize = Interface.askForInput("Enter portion size: ");
                    int dishDateAdded = Integer.parseInt(Interface.askForInput("Enter date added (seconds of day): "));
                    boolean dishAvailability = Boolean.parseBoolean(Interface.askForInput("Is dish available? (true/false): "));
                    String dishIngredients = Interface.askForInput("Enter ingredients: ");
                    int dishPrepTime = Integer.parseInt(Interface.askForInput("Enter preparation time (minutes): "));
                    double dishSpecialPrice = Double.parseDouble(Interface.askForInput("Enter special price: "));
                    String dishImageURL = Interface.askForInput("Enter image URL: ");
                    Dish newDish = new Dish(dishName, dishDescription, dishPrice, dishCalories, dishCategory, dishPortionSize, dishDateAdded, dishAvailability, dishIngredients, dishPrepTime, dishSpecialPrice, dishImageURL);
                    selectedRestaurant.menu.addDish(newDish);
                    Interface.showMessage("Dish added to menu!");
                    break;

                case "4": // Remove an employee
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectedRestaurant = selectRestaurant(restaurants);
                    selectedRestaurant.displayEmployees();
                    int removeEmpId = Integer.parseInt(Interface.askForInput("Enter ID of employee to remove: "));
                    selectedRestaurant.getEmployees().removeIf(emp -> emp.getIdEmployee() == removeEmpId);
                    Interface.showMessage("Employee removed!");
                    break;

                case "5": // Show restaurant employees
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectRestaurant(restaurants).displayEmployees();
                    break;

                case "6": // Take an order
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectedRestaurant = selectRestaurant(restaurants);
                    int orderNum = Integer.parseInt(Interface.askForInput("Enter order number: "));
                    Order newOrder = new Order(orderNum);
                    boolean addingDishes = true;
                    while (addingDishes) {
                        String addDish = Interface.askForInput("Add dish to order? (yes/no): ");
                        if (addDish.equalsIgnoreCase("no")) {
                            addingDishes = false;
                        } else {
                            String orderDishName = Interface.askForInput("Enter dish name: ");
                            for (Dish dish : selectedRestaurant.menu.getDishes()) {
                                if (dish.getName().equalsIgnoreCase(orderDishName)) {
                                    newOrder.addDish(dish);
                                    Interface.showMessage("Dish added to order!");
                                    break;
                                }
                            }
                        }
                    }
                    selectedRestaurant.addOrder(newOrder);
                    Interface.showMessage("Order placed!");
                    break;

                case "7": // Show all restaurant orders
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectRestaurant(restaurants).showOrders();
                    break;

                case "8": // Save orders
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectedRestaurant = selectRestaurant(restaurants);
                    String saveFile = Interface.askForInput("Enter filename to save orders: ");
                    selectedRestaurant.saveOrdersToFile(saveFile);
                    Interface.showMessage("Orders saved!");
                    break;

                case "9": // Load orders
                    if (restaurants.isEmpty()) {
                        Interface.showMessage("No restaurants available.");
                        break;
                    }
                    selectedRestaurant = selectRestaurant(restaurants);
                    String loadFile = Interface.askForInput("Enter filename to load orders: ");
                    selectedRestaurant.loadOrdersFromFile(loadFile);
                    Interface.showMessage("Orders loaded!");
                    break;

                case "10": // Exit
                    running = false;
                    Interface.showMessage("Exiting system...");
                    break;

                default:
                    Interface.showMessage("Invalid choice. Try again.");
            }
        }
    }

    private static Restaurant selectRestaurant(ArrayList<Restaurant> restaurants) {
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getName());
        }
        int selection = Integer.parseInt(Interface.askForInput("Choose a restaurant by number: ")) - 1;
        return restaurants.get(selection);
    }
}
