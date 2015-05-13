package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by manishkaatoch on 12/05/15.
 */
public class Cart {

    List<OrderItem> orderItemList;


    public Cart() {
    }

//    public Cart(Customer customer) {
//        this.customer = customer;
//    }

    public void addOrderItem(OrderItem orderItem) {
        if (orderItemList == null) {
            orderItemList = new ArrayList<>();
        }
        orderItemList.add(orderItem);
    }

    public int getItemCount() {
        return orderItemList.size();
    }

    public List<OrderItem> getOrderItems() {
        return orderItemList;
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (OrderItem orderItem : orderItemList) {
            totalPrice = totalPrice.add(orderItem.getProduct().getPrice());
        }
        return totalPrice;
    }


}
