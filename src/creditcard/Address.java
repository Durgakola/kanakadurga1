package creditcard;

public class Address {
    public String area;
    public String steetNo;
    public String flatNo;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", steetNo='" + steetNo + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
