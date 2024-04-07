package swiggy;

public class RestaurantDetails {
    public String name;
    public Dishe dishe;
    public int rating;

    public Address address;

    @Override
    public String toString() {
        return "Restarent{" +
                "name='" + name + '\'' +
                ", item=" + dishe +
                ", rating=" + rating +
                ", address=" + address +
                '}';
    }
}
