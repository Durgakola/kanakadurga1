package homeDemo;

public class HomeTest {
    public static void main(String[] args) {
        HomeService homeService=new HomeService();
        Home home=homeService.getHome();
        System.out.println(home);

    }
}
