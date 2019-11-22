package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column
    private Integer carWashId;

    @Column
    private Integer clientId;

    @Column
    private Integer masterId;

    @Column
    private Integer vehicleTypeId;

    @Column
    private Date dateFrom;

    @Column
    private Date dateTo;

    @Column
    private Date modifiedDate;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Integer getCarWashId() {
        return carWashId;
    }

    public void setCarWashId(Integer carWashId) {
        this.carWashId = carWashId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Integer getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order that = (Order) o;

        if (orderId != that.orderId) return false;
        if (carWashId != null ? !carWashId.equals(that.carWashId) : that.carWashId != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (masterId != null ? !masterId.equals(that.masterId) : that.masterId != null) return false;
        if (vehicleTypeId != null ? !vehicleTypeId.equals(that.vehicleTypeId) : that.vehicleTypeId != null)
            return false;
        if (dateFrom != null ? !dateFrom.equals(that.dateFrom) : that.dateFrom != null) return false;
        if (dateTo != null ? !dateTo.equals(that.dateTo) : that.dateTo != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (carWashId != null ? carWashId.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (masterId != null ? masterId.hashCode() : 0);
        result = 31 * result + (vehicleTypeId != null ? vehicleTypeId.hashCode() : 0);
        result = 31 * result + (dateFrom != null ? dateFrom.hashCode() : 0);
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
