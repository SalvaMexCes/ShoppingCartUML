package shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void subTotalTest() {
        double expected = 150.00;

        Product hat = new Hat(1, Size.XL, 5.00, "hat", 20);
        Product shirt = new Shirt(1, Size.LARGE, 10.00, "shirt", 20);

        User user = new User();
        user.addToCart(hat, 10);
        user.addToCart(shirt, 10);
        double actual = user.getCart().subTotal();

        Assertions.assertEquals(expected, actual);
    }
}