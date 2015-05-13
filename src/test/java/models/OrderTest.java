package models;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by balajisivaraman on 13/05/15.
 */
public class OrderTest {

    @Test(expected = Exception.class)
    public void testShouldNotAllowOrderCreationWithoutCustomer() throws Exception {
        Cart cart = new Cart();
        OrderItem orderItemA = new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3);
        cart.addOrderItem(orderItemA);
        OrderItem orderItemB = new OrderItem(new Product("Product B", new BigDecimal(2.5)), 2);
        cart.addOrderItem(orderItemB);
        new Order(cart,null);
    }

    @Test
    public void shouldRegisterMessageToServiceOnOrderCreation() throws  Exception
    {
        Customer customer = new Customer("Raj","Raj@gmail.com");
        Cart cart = new Cart();
        OrderItem orderItemA = new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3);
        cart.addOrderItem(orderItemA);
        OrderItem orderItemB = new OrderItem(new Product("Product B", new BigDecimal(2.5)), 2);
        cart.addOrderItem(orderItemB);
        Order order = new Order(cart,customer);
        Assert.assertTrue(order.checkIfUserIsSubscribed(customer));
    }
}
