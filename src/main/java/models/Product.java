package models;

import java.math.BigDecimal;

/**
 * Created by manishkaatoch on 12/05/15.
 */
public class Product {

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (price.compareTo(BigDecimal.ZERO) == -1) {
            throw new IllegalArgumentException("Product price cannot be negative.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
