package by.com.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    @Column
    private Integer userId;

    @Column
    private Integer contactsId;

    @Column
    private Integer positionId;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Date modifiedDate;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContactsId() {
        return contactsId;
    }

    public void setContactsId(Integer contactsId) {
        this.contactsId = contactsId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

        Person that = (Person) o;

        if (personId != that.personId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (contactsId != null ? !contactsId.equals(that.contactsId) : that.contactsId != null) return false;
        if (positionId != null ? !positionId.equals(that.positionId) : that.positionId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (contactsId != null ? contactsId.hashCode() : 0);
        result = 31 * result + (positionId != null ? positionId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        return result;
    }
}
