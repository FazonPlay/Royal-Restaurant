import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    protected int idMenu;
    private String name;
    private LocalDate creationDate;
    private String menuType;
    private ArrayList<Dish> dishes;

    public Menu(int idMenu, String name, String creationDate, String menuType) {
        this.idMenu = idMenu;
        this.name = name;
        this.creationDate = LocalDate.parse(creationDate);
        this.menuType = menuType;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public void showMenu() {
        System.out.println("Menu: " + name + " (" + menuType + ")");
        for (Dish dish : dishes) {  // Fixed iteration
            System.out.println(dish.getName() + " - " + dish.getPrice());
        }
    }

    public String getName() {
        return name;
    }

    // Add getter for dishes
    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    // Add getter for menuType
    public String getMenuType() {
        return menuType;
    }

    // Add getter for creationDate
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", menuType='" + menuType + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
