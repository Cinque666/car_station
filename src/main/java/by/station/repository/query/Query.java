package by.station.repository.query;

public enum Query {

    SELECT_FROM_APPUSER_WHERE_LOGIN("from AppUser where login like :param"),

    SELECT_FROM_ROLE_WHERE_ID("from Role where id = :param"),
    SELECT_FROM_ROLE("from Role"),
    SELECT_FROM_ROLE_WHERE_NAME_LIKE("from Role where name like :param"),

    SELECT_FROM_GASSTATION("from GasStation"),

    SELECT_FROM_FUEL("from Fuel"),
    SELECT_FROM_FUEL_WHERE_FUELID("from Fuel where fuelId = :param"),

    SELECT_FROM_CARWASH("from CarWash"),

    SELECT_FROM_PERSON("from Person"),

    SELECT_FROM_VEHICLE_TYPE("from VehicleType");

    Query(String query) {
        this.query = query;
    }

    private String query;

    public String getQuery() {
        return query;
    }
}
