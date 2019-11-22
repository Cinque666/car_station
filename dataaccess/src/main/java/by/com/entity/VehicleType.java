package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class VehicleType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleTypeId;

    @Column
    private String name;

    @Column
    private Date modiifiedDate;

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getModiifiedDate() {
        return modiifiedDate;
    }

    public void setModiifiedDate(Date modiifiedDate) {
        this.modiifiedDate = modiifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleType that = (VehicleType) o;

        if (vehicleTypeId != that.vehicleTypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (modiifiedDate != null ? !modiifiedDate.equals(that.modiifiedDate) : that.modiifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (modiifiedDate != null ? modiifiedDate.hashCode() : 0);
        return result;
    }
}
