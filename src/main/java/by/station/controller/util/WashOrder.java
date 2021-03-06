package by.station.controller.util;

public class WashOrder {

    private Integer washOrderId;
    private String carWashName;
    private String clientName;
    private String masterName;
    private String vehicleName;

    public Integer getWashOrderId() {
        return washOrderId;
    }

    public void setWashOrderId(Integer washOrderId) {
        this.washOrderId = washOrderId;
    }

    public String getCarWashName() {
        return carWashName;
    }

    public void setCarWashName(String carWashName) {
        this.carWashName = carWashName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
