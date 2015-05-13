package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setup() {
        this.customer = new Customer("UserName", "username@email.com");
    }

    @Test(expected = Exception.class)
    public void testCheckoutShouldThrowExceptionWhenCartIsEmpty() throws Exception {
        Cart cart = new Cart();
        customer.checkout(cart);
    }

    @Test
    public void testCheckoutShouldGiveOrderWhenCartIsNotEmpty() throws  Exception {
        Cart cart = new Cart();
        OrderItem orderItemA = new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3);
        cart.addOrderItem(orderItemA);
        OrderItem orderItemB = new OrderItem(new Product("Product B", new BigDecimal(2.5)), 2);
        cart.addOrderItem(orderItemB);
        Order order = customer.checkout(cart);
        Assert.assertNotNull(order);
    }
}
