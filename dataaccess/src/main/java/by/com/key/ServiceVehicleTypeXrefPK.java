package by.com.key;

import java.io.Serializable;

public class ServiceVehicleTypeXrefPK implements Serializable {

    protected int serviceId;

    protected int vehicleTypeId;

    public ServiceVehicleTypeXrefPK() {
    }

    public ServiceVehicleTypeXrefPK(int serviceId, int vehicleTypeId) {
        this.serviceId = serviceId;
        this.vehicleTypeId = vehicleTypeId;
    }
}
