package shopping;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        Product hat = new Hat(1, Size.XL, 5.00, "hat", 20);
        Product shirt = new Shirt(1, Size.LARGE, 10.00, "shirt", 20);
        user.addToCart(hat, 2);
        user.addToCart(shirt, 1);
        user.removeFromCart(hat, 1);
        System.out.println(user.getCart().getProducts());
        System.out.println(user.getCart().cartQty());
        System.out.println(user.getCart().subTotal());
        System.out.println(user.getCart().totalAfterTax());
        user.getCart().checkOut();
        user.getCart().checkSaleDay(Special.FRIDAY);
        Food fries = new Fries(1, Size.LARGE, 3.00, "fries", 15);
        System.out.println(fries.isPerishable());


    }
}
