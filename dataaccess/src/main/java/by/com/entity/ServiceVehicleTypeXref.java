package by.com.entity;

import by.com.key.ServiceVehicleTypeXrefPK;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.sql.Date;

@Entity
@IdClass(ServiceVehicleTypeXrefPK.class)
public class ServiceVehicleTypeXref implements Serializable {

    @Id
    private int serviceId;

    @Id
    private int vehicleTypeId;

    @Column
    private Double price;

    @Column
    private Date modifiedDate;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

        ServiceVehicleTypeXref that = (ServiceVehicleTypeXref) o;

        if (serviceId != that.serviceId) return false;
        if (vehicleTypeId != that.vehicleTypeId) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceId;
        result = 31 * result + vehicleTypeId;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
