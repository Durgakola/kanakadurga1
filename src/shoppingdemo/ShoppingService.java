package shoppingdemo;

public class ShoppingService {

    public Product SelectProduct(ProductSpecification productSpecification1){
        Product product1=new Product();
        product1.price="3000";
        product1.type="kurthis";
        product1.barcode="345678";
        product1.productSpecification=productSpecification1;
        return product1;

    }
}
