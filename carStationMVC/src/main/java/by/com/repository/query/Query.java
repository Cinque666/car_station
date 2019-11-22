package by.com.repository.query;

public enum Query {

    SELECT_FROM_APPUSER_WHERE_LOGIN("from AppUser where login like :param"),

    SELECT_FROM_ROLE_WHERE_ID("from Role where id = :param");


    Query(String query) {
        this.query = query;
    }

    private String query;

    public String getQuery() {
        return query;
    }
}
