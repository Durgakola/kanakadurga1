package shopping;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<ProductDetails> productDetails;

    public Shop() {
        productDetails= new ArrayList<>();
    }

    public List<ProductDetails> ProductsInShop(UserSpecification userSpecification) {

        ProductDetails kurthis = new ProductDetails();
        kurthis.Type = "Kurthis";
        kurthis.price = 1000;
        kurthis.brandName = "Aavasa";
        kurthis.color="Pink";
        kurthis.userSpecification = userSpecification;

        ProductDetails dhupata = new ProductDetails();
        dhupata.Type = "Dhupatas";
        dhupata.price = 200;
        dhupata.brandName = "Aavasa";
        dhupata.color="red,pink,blue";
        dhupata.userSpecification = userSpecification;

        ProductDetails leggings = new ProductDetails();
        leggings.Type = "Leggings";
        leggings.price = 1000;
        leggings.brandName = "Aavasa";
        leggings.color="black";
        leggings.userSpecification = userSpecification;

        productDetails.add(kurthis);
        productDetails.add(dhupata);
        productDetails.add(leggings);

      return productDetails;

    }
}
