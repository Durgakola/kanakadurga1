package swiggyApplication;

public class Dish {
    public String dishName;
    public String dishType;

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", dishType='" + dishType + '\'' +
                '}';
    }
}
