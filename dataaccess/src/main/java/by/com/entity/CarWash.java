package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class CarWash implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carWashId;

    @Column
    private Integer contactsId;

    @Column
    private String name;

    @Column
    private Date modifiedDate;

    public int getCarWashId() {
        return carWashId;
    }

    public void setCarWashId(int carWashId) {
        this.carWashId = carWashId;
    }

    public Integer getContactsId() {
        return contactsId;
    }

    public void setContactsId(Integer contactsId) {
        this.contactsId = contactsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        CarWash that = (CarWash) o;

        if (carWashId != that.carWashId) return false;
        if (contactsId != null ? !contactsId.equals(that.contactsId) : that.contactsId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carWashId;
        result = 31 * result + (contactsId != null ? contactsId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
