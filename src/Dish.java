import java.time.LocalTime;

public class Dish {
    private String name;
    private String description;
    private Double price;
    private String calories;
    private String category;
    private String portionSize;
    private LocalTime dateAdded;
    private boolean availability;

    public Dish(String name, String description, Double price, String calories, String category, String portionSize, int dateAdded, boolean availability) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.calories = calories;
        this.category = category;
        this.portionSize = portionSize;
        this.dateAdded = LocalTime.ofSecondOfDay(dateAdded);
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getCalories() {
        return calories;
    }

    public String getCategory() {
        return category;
    }

    public String getPortionSize() {
        return portionSize;
    }

    public LocalTime getDateAdded() {
        return dateAdded;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPortionSize(String portionSize) {
        this.portionSize = portionSize;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = LocalTime.ofSecondOfDay(dateAdded);
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

//    @Override
//    public String toString() {
//        return "Dish{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                ", calories='" + calories + '\'' +
//                ", category='" + category + '\'' +
//                ", portionSize='" + portionSize + '\'' +
//                ", dateAdded=" + dateAdded +
//                ", availability=" + availability +
//                '}';
//    }
}

// EVERYTHINH HAS TO BE SYSOUT NOT RETURN TYPE CUZ CIRIL IS A BITCH
