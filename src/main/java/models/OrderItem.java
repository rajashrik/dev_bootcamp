package models;

/**
 * Created by manishkaatoch on 12/05/15.
 */
public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        if(quantity <= 0){
            throw new IllegalArgumentException("Product quantity should be atleast 1");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
}
