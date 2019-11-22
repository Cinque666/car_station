package by.com.entity;

import by.com.key.PersonGasStationXrefPK;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.sql.Date;

@Entity
@IdClass(PersonGasStationXrefPK.class)
public class PersonGasStationXref implements Serializable {

    @Id
    private int personId;

    @Id
    private int gasStationId;

    @Column
    private Date dateFrom;

    @Column
    private Date dateTo;

    @Column
    private Date modifiedDate;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(int gasStationId) {
        this.gasStationId = gasStationId;
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

        PersonGasStationXref that = (PersonGasStationXref) o;

        if (personId != that.personId) return false;
        if (gasStationId != that.gasStationId) return false;
        if (dateFrom != null ? !dateFrom.equals(that.dateFrom) : that.dateFrom != null) return false;
        if (dateTo != null ? !dateTo.equals(that.dateTo) : that.dateTo != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + gasStationId;
        result = 31 * result + (dateFrom != null ? dateFrom.hashCode() : 0);
        result = 31 * result + (dateTo != null ? dateTo.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
