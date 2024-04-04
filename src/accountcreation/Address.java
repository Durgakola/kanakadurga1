package accountcreation;

public class Address {
    public String area;
    public String flatNo;
    public String country;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
