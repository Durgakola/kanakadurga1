package shopping;

public class Test {
    public static void main(String[] args) {
        Shop shop=new Shop();
        ShoppingService shoppingService=new ShoppingService(shop);

        UserSpecification userSpecification=new UserSpecification();
        userSpecification.type="Kurthis";
        userSpecification.price=1000;
        userSpecification.color="pink";
        userSpecification.size="midium";

        boolean isAvailable = shoppingService.isProductAvailable(userSpecification);
        if(isAvailable){
            System.out.println("Product is available.");
        }
        else{
            System.out.println("Product is not available.");
        }
    }
}
