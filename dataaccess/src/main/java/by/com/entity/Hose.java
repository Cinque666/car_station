package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Hose implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hoseId;

    @Column
    private Integer dispenserId;

    @Column
    private Integer tankId;

    @Column
    private Short status;

    @Column
    private Date modifiedDate;

    public int getHoseId() {
        return hoseId;
    }

    public void setHoseId(int hoseId) {
        this.hoseId = hoseId;
    }

    public Integer getDispenserId() {
        return dispenserId;
    }

    public void setDispenserId(Integer dispenserId) {
        this.dispenserId = dispenserId;
    }

    public Integer getTankId() {
        return tankId;
    }

    public void setTankId(Integer tankId) {
        this.tankId = tankId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

        Hose that = (Hose) o;

        if (hoseId != that.hoseId) return false;
        if (dispenserId != null ? !dispenserId.equals(that.dispenserId) : that.dispenserId != null) return false;
        if (tankId != null ? !tankId.equals(that.tankId) : that.tankId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hoseId;
        result = 31 * result + (dispenserId != null ? dispenserId.hashCode() : 0);
        result = 31 * result + (tankId != null ? tankId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
