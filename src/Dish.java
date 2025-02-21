import java.time.LocalTime;

public class Dish {
     String name;
     String description;
     double price;
     String calories;
     String category;
     String portionSize;
     LocalTime dateAdded;
     boolean availability;
     String ingredients;
     int preparationTime;
     double specialPrice;
     String imageURL;


    public Dish(String name, String description, Double price, String calories, String category, String portionSize, int dateAdded, boolean availability, String ingredients, int preparationTime, double specialPrice, String imageURL) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.calories = calories;
        this.category = category;
        this.portionSize = portionSize;
        this.dateAdded = LocalTime.ofSecondOfDay(dateAdded);
        this.availability = availability;
        this.ingredients = ingredients;
        this.preparationTime = preparationTime;
        this.specialPrice = specialPrice;
        this.imageURL = imageURL;
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

    public String getIngredients() {
        return ingredients;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public String getImageURL() {
        return imageURL;
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

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", calories='" + calories + '\'' +
                ", category='" + category + '\'' +
                ", portionSize='" + portionSize + '\'' +
                ", dateAdded=" + dateAdded +
                ", availability=" + availability +
                ", ingredients='" + ingredients + '\'' +
                ", preparationTime=" + preparationTime +
                ", specialPrice=" + specialPrice +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
