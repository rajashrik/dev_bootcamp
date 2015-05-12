package models;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by manishkaatoch on 12/05/15.
 */
public class CartTest {

    @Test
    public void testShouldAddOrderItemToCart() {
        Cart cart = new Cart();
        cart.addOrderItem(new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3));
        Assert.assertEquals(1,cart.getItemCount());
    }

    @Test
    public void testShouldGiveAllOrderItems() {
        Cart cart = new Cart();
        OrderItem orderItemA = new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3);
        cart.addOrderItem(orderItemA);
        OrderItem orderItemB = new OrderItem(new Product("Product B", new BigDecimal(2.5)), 2);
        cart.addOrderItem(orderItemB);
        List<OrderItem> orderItemList = cart.getOrderItems();
        Assert.assertTrue(orderItemList.contains(orderItemA) && orderItemList.contains(orderItemB));
    }

    @Test
    public void testShouldGiveTotalOrderItemValue(){
        Cart cart = new Cart();
        OrderItem orderItemA = new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3);
        cart.addOrderItem(orderItemA);
        OrderItem orderItemB = new OrderItem(new Product("Product B", new BigDecimal(2.5)), 2);
        cart.addOrderItem(orderItemB);
        BigDecimal totalPrice = cart.getTotalPrice();
        Assert.assertEquals(new BigDecimal("7.0"), totalPrice);
    }

}
