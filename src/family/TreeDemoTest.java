package family;

public class TreeDemoTest {

    public static void main(String[] args) {

        Family test=new Family(); //Here i am creating object
        test=new Family();
        //I am assign the new object to test ref so the above object is elgible for garbage collection
        test=new Family();

        test=new Family();
        test.name="A";
        Family ref=test;
        Family ref1=test;
        ref1.name="B";
        Family ref2=test;
        Family a=new Family();
        a.name="A";
        Family b=new Family();
        a.name="B";
        a=new Family();
        test=a;
        System.out.println(ref2.name);
        System.out.println(ref1.name);






//        Family a=new Family();
//        Address aAddress=new Address();
//        aAddress.pincode="1";
//        aAddress.area="hyd";
//        aAddress.city="hyd";
//        aAddress.flatNo="306";
//        aAddress.country="India";
//        a.name="A";
//        a.address=aAddress;
//
//
//        Family[] akids=new Family[2];
//
//        Family b=new Family();
//        Address baAddress=new Address();
//        baAddress.pincode="1";
//        baAddress.area="hyd";
//        baAddress.city="hyd";
//        baAddress.flatNo="306";
//        baAddress.country="India";
//        b.name="B";
//        a =new Family();
    }
}
