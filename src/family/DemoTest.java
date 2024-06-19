package family;

public class DemoTest {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.a=10;
        Demo d2=d1;
        Demo d3=d1;
        Demo d4=new Demo();
        d1=d4;
        System.out.println(d1.a);
        System.out.println(d2.a);
        System.out.println(d3.a);
        System.out.println(d4.a);
    }
}
