package restarent;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Service service=new Service();
        List<Restarent> restarents=service.getService();
        System.out.println(restarents);
    }
}
