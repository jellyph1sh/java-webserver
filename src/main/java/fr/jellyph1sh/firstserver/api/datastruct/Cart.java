package fr.jellyph1sh.firstserver.api.datastruct;

import org.springframework.data.annotation.Id;

public class Cart {
    @Id private String id;

    private String orderId;
    private String productId;
    private int quantity;

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
