package by.com.key;

import java.io.Serializable;

public class OrderServiceXrefPK implements Serializable {

    protected int orderId;

    protected int serviceId;

    public OrderServiceXrefPK() {
    }

    public OrderServiceXrefPK(int orderId, int serviceId) {
        this.orderId = orderId;
        this.serviceId = serviceId;
    }
}
