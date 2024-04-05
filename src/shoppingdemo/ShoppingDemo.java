package shoppingdemo;


import java.util.ArrayList;
import java.util.List;

public class ShoppingDemo {
    public static void main(String[] args) {
        Product tshirtProduct=new Product();
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.price="2500";
        productSpecification.size="M";
        productSpecification.color="wight";
        tshirtProduct.type="Tshirt";
        tshirtProduct.price="800";
        tshirtProduct.barcode="11111";
        tshirtProduct.brand="DNMX";

        tshirtProduct.productSpecification=productSpecification;


        Product jeansProduct=new Product();
        ProductSpecification productSpecification1=new ProductSpecification();
        productSpecification1.price="3000";
        productSpecification1.size="M";
        productSpecification1.color="black";
        jeansProduct.type="Jeans";
        jeansProduct.price="1000";
        jeansProduct.barcode="22222";
        jeansProduct.brand="Aavasa";
        jeansProduct.productSpecification=productSpecification1;

        Product shirtProduct=new Product();
        ProductSpecification productSpecification2=new ProductSpecification();
        productSpecification2.price="3000";
        productSpecification2.size="M";
        productSpecification2.color="black";
        shirtProduct.type="Jeans";
        shirtProduct.price="1000";
        shirtProduct.barcode="33333";
        shirtProduct.brand="likra";
        jeansProduct.productSpecification=productSpecification2;


        Shop shop=new Shop();
        List<Product> productList=new ArrayList<>();
        productList.add(tshirtProduct);
        productList.add(jeansProduct);
        productList.add(shirtProduct);

        shop.productList=productList;

        System.out.println(shop.toString());

    }
}
