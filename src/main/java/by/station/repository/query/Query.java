package by.station.repository.query;

public enum Query {

    SELECT_FROM_APPUSER_WHERE_LOGIN("from AppUser where login like :param"),

    SELECT_FROM_ROLE_WHERE_ID("from Role where id = :param"),
    SELECT_FROM_ROLE("from Role"),
    SELECT_FROM_ROLE_WHERE_NAME_LIKE("from Role where name like :param"),

    SELECT_FROM_GASSTATION("from GasStation"),

    SELECT_FROM_FUEL("from Fuel");

    Query(String query) {
        this.query = query;
    }

    private String query;

    public String getQuery() {
        return query;
    }
}
