package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Contacts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactsId;

    @Column
    private Integer addressId;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private Date modifiedDate;

    public int getContactsId() {
        return contactsId;
    }

    public void setContactsId(int contactsId) {
        this.contactsId = contactsId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

        Contacts that = (Contacts) o;

        if (contactsId != that.contactsId) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactsId;
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
