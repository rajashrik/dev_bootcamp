package hello.controllers;

import models.Cart;
import models.Greeting;
import models.OrderItem;
import models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Cart greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        Cart cart = new Cart();
        OrderItem orderItemA = new OrderItem(new Product("Product A", new BigDecimal(4.5)), 3);
        cart.addOrderItem(orderItemA);
        OrderItem orderItemB = new OrderItem(new Product("Product B", new BigDecimal(2.5)), 2);
        cart.addOrderItem(orderItemB);
        return cart;
    }

}