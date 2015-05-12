package models;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by manishkaatoch on 12/05/15.
 */
public class OrderItemTest {

    @Test(expected = IllegalArgumentException.class)
    public void testOrderItemQuantityShouldBeMoreThanZero() {
        new OrderItem(new Product("Product A", new BigDecimal(10)), 0);
    }
}
