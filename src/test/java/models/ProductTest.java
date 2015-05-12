package models;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by manishkaatoch on 12/05/15.
 */
public class ProductTest {

    @Test(expected = IllegalArgumentException.class)
    public void testProductNameShouldNotBeEmpty(){
        new Product("",new BigDecimal(2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testProductNameShouldNotBeNull(){
        new Product(null,new BigDecimal(4));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testProductPriceShouldNotBeNegative(){
        new Product("Product A",new BigDecimal(-1));
    }
}
