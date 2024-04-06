package restarent;

public class RestarentDetails {
    public String name;
    public Dishes deeshes;
    public int rating;

    public Address address;

    @Override
    public String toString() {
        return "Restarent{" +
                "name='" + name + '\'' +
                ", item=" + deeshes +
                ", rating=" + rating +
                ", address=" + address +
                '}';
    }
}
