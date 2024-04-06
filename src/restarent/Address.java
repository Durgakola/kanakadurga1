package restarent;

public class Address {
    public String flatNo;
    public String pincode;
    public String area;
    public int streetNo;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", area='" + area + '\'' +
                ", streetNo=" + streetNo +
                '}';
    }
}
