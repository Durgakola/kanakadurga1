package equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
//        Address address=new Address();
//        Address test=address;
//
//        address.area="KPHB";
//        address.flatNo="123-123";
//        address.pincode="522790";
//        address.street="kphb 5th phase";
//        address.state="Andhra";
//
//        Address address1=null;
//        System.out.println(address.equals(address));
//        System.out.println(address.equals(address1));
//        System.out.println(address1.equals(address));

        System.out.println("reflective starts");
        Address x=new Address();
        x.area="KPHB";
        x.flatNo="123-123";
        x.pincode="522790";
        x.street="kphb 5th phase";
        x.state="Andhra";

        Address y=new Address();
        y.area="KPHB";
        y.flatNo="123-123";
        y.pincode="522790";
        y.street="kphb 5th phase";
        y.state="Andhra";
        System.out.println(x.area.equals(y.area) && x.pincode.equals(y.pincode) && x.street.equals(y.street)
                && x.state.equals(y.state) &&x.flatNo.equals(y.flatNo));
        System.out.println(x.equals(x));
        System.out.println(y.equals(y));
        System.out.println("reflactive ends");


        System.out.println("Symmentric starts");
        Address address1=new Address();
        address1.area="KPHB";
        address1.flatNo="123-123";
        address1.pincode="522790";
        address1.street="kphb 5th phase";
        address1.state="Andhra";

        Address address2=new Address();
        address2.area="KPHB";
        address2.flatNo="123-123";
        address2.pincode="522790";
        address2.street="kphb 5th phase";
        address2.state="Andhra";

        System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address1));
        System.out.println("Symmentric ends");

        System.out.println("Transive starts");
        Address add1=new Address();
        add1.area="KPHB";
        add1.flatNo="123-123";
        add1.pincode="522790";
        add1.street="kphb 5th phase";
        add1.state="Andhra";

        Address add2=new Address();
        add2.area="KPHB";
        add2.flatNo="123-123";
        add2.pincode="522790";
        add2.street="kphb 5th phase";
        add2.state="Andhra";

        Address add3=new Address();
        add3.area="KPHB";
        add3.flatNo="123-123";
        add3.pincode="522790";
        add3.street="kphb 5th phase";
        add3.state="Andhra";

        System.out.println(add1.equals(add2));
        System.out.println(add2.equals(add3));
        System.out.println(add1.equals(add3));

        System.out.println("Address1 hashcode :"+add1.hashCode());
        System.out.println("Address2 hashcode :"+add2.hashCode());
        System.out.println("Address3 hashcode :"+add3.hashCode());
        System.out.println("Transistive ends");

    }
}
