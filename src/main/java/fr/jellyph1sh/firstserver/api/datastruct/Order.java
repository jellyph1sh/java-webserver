package fr.jellyph1sh.firstserver.api.datastruct;

import org.springframework.data.annotation.Id;

public class Order {
    @Id private String id;

    private String clientId;
    private float totalPrice;
    private boolean status;

    public String getClientId() {
        return clientId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public boolean getStatus() {
        return status;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
