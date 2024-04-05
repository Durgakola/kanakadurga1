package shopping;

import java.util.List;

public class ShoppingService {
    public Shop shop;

    public ShoppingService(Shop shop){
        this.shop = shop;
    }

    public boolean isProductAvailable(UserSpecification userSpecification) {
        List<ProductDetails> products = shop.ProductsInShop(userSpecification);
        for (ProductDetails product : products) {
            if (product.color.equalsIgnoreCase(userSpecification.color)) {
                System.out.println("your item is product is " +product.Type +" prise : "+ product.price +
                        " Brand name is " + product.brandName +" and yourSpecification are "+ product.userSpecification);
                return true;
            }
        }
        return false;
    }
}
