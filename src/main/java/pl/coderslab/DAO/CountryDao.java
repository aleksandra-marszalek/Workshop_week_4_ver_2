package pl.coderslab.DAO;

public class CountryDao {

    private static final String CREATE_TABLE_COUTRIES_QUERY = "create table countries (id bigint, name varchar(200), " +
            " primary key (id)) character set UTF8;";
    private static final String CREATE_USER_QUERY = "INSERT INTO countries (id, name) VALUES (?, ?)";
    private static final String READ_USER_QUERY = "Select * from countries where id = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE countries SET name = ? WHERE id = ?";
    private static final String DELETE_USER_QUERY = "DELETE FROM countries where id = ?";
    private static final String READ_ALL_USERS_QUERY = "SELECT * FROM countries";
}
