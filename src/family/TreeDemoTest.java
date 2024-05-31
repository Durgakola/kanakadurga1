package family;

public class TreeDemoTest {

    public static void main(String[] args) {

        Family test=new Family();
        test=new Family();
        test=new Family();
        test=new Family();
        test=new Family();
        test=new Family();


        Family ref=test;

        Family ref1=test;

        Family ref2=test;




        Family a=new Family();
        Address aAddress=new Address();
        aAddress.pincode="1";
        aAddress.area="hyd";
        aAddress.city="hyd";
        aAddress.flatNo="306";
        aAddress.country="India";
        a.name="A";
        a.address=aAddress;


        Family[] akids=new Family[2];

        Family b=new Family();
        Address baAddress=new Address();
        baAddress.pincode="1";
        baAddress.area="hyd";
        baAddress.city="hyd";
        baAddress.flatNo="306";
        baAddress.country="India";
        b.name="B";
        a =new Family();
    }
}
