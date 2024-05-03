package swiggylatestdemo;

public class Dish {
    public String name;
    public double price;
    public double rating;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

}
