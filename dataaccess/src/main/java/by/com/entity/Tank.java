package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Tank implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tankId;

    @Column
    private Integer gasStationId;

    @Column
    private Integer fuelId;

    @Column
    private String vin;

    @Column
    private Double capacity;

    @Column
    private Date modifiedDate;

    public int getTankId() {
        return tankId;
    }

    public void setTankId(int tankId) {
        this.tankId = tankId;
    }

    public Integer getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(Integer gasStationId) {
        this.gasStationId = gasStationId;
    }

    public Integer getFuelId() {
        return fuelId;
    }

    public void setFuelId(Integer fuelId) {
        this.fuelId = fuelId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
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

        Tank that = (Tank) o;

        if (tankId != that.tankId) return false;
        if (gasStationId != null ? !gasStationId.equals(that.gasStationId) : that.gasStationId != null) return false;
        if (fuelId != null ? !fuelId.equals(that.fuelId) : that.fuelId != null) return false;
        if (vin != null ? !vin.equals(that.vin) : that.vin != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tankId;
        result = 31 * result + (gasStationId != null ? gasStationId.hashCode() : 0);
        result = 31 * result + (fuelId != null ? fuelId.hashCode() : 0);
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
