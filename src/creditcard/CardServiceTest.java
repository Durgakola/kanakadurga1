package creditcard;

public class CardServiceTest {
    public static void main(String[] args) {
        Address address=new Address();
        address.area="Hydarabad";
        address.flatNo="23-678";
        address.pincode="522409";
        address.steetNo="kphb 6th phase";

        User user=new User();
        user.name="kanakadurga";
        user.dob="24-2-2000";
        user.pan="ACD23456H";
        user.mobileNo="9391976191";
        user.adhar="123 435 456";
        user.address=address;
        CreditCardService cardService=new CreditCardService();
        System.out.println(cardService.card(user));
    }
}
