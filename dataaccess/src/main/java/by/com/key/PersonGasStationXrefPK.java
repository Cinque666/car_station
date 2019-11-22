package by.com.key;

import java.io.Serializable;

public class PersonGasStationXrefPK implements Serializable {

    protected int personId;

    protected int gasStationId;

    public PersonGasStationXrefPK() {
    }

    public PersonGasStationXrefPK(int personId, int gasStationId) {
        this.personId = personId;
        this.gasStationId = gasStationId;
    }
}
