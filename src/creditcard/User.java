package creditcard;

public class User {
    public String name;
    public String dob;
    public String mobileNo;
    public String adhar;
    public String pan;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", adhar='" + adhar + '\'' +
                ", pan='" + pan + '\'' +
                ", address=" + address +
                '}';
    }
}
