package inheritance;

public class TiruService extends HelloWorldService{
    @Override
    public String sayHi() {
        System.out.println("form tiruService");
        return super.sayHi();
    }
}
