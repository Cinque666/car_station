package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Dispenser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dispenserId;

    @Column
    private Integer gasStationId;

    @Column
    private Integer vin;

    @Column
    private Date modifiedDate;

    public int getDispenserId() {
        return dispenserId;
    }

    public void setDispenserId(int dispenserId) {
        this.dispenserId = dispenserId;
    }

    public Integer getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(Integer gasStationId) {
        this.gasStationId = gasStationId;
    }

    public Integer getVin() {
        return vin;
    }

    public void setVin(Integer vin) {
        this.vin = vin;
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

        Dispenser that = (Dispenser) o;

        if (dispenserId != that.dispenserId) return false;
        if (gasStationId != null ? !gasStationId.equals(that.gasStationId) : that.gasStationId != null) return false;
        if (vin != null ? !vin.equals(that.vin) : that.vin != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dispenserId;
        result = 31 * result + (gasStationId != null ? gasStationId.hashCode() : 0);
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
