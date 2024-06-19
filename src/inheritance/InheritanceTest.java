package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        HelloWorldService helloWorldService=new HelloWorldService();
        String greet=helloWorldService.sayHi();
        System.out.println(greet);

        TiruService tiruService=new TiruService();
        String tiruGreet= tiruService.sayHi();
        System.out.println(tiruGreet);

        HelloWorldService test=new TiruService();
        String greeting=test.sayHi();
        System.out.println(greeting);

    }
}
