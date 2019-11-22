package by.com.key;

import java.io.Serializable;

public class PersonCarWashXrefPK implements Serializable {

    protected int personId;

    protected int carWashId;

    public PersonCarWashXrefPK() {
    }

    public PersonCarWashXrefPK(int personId, int carWashId) {
        this.personId = personId;
        this.carWashId = carWashId;
    }
}
