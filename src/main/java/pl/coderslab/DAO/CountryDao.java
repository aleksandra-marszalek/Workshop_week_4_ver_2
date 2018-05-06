package pl.coderslab.DAO;

import pl.coderslab.DTO.CountryDto;
import pl.coderslab.DTO.UserDto;
import pl.coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CountryDao {

    private static final String CREATE_TABLE_COUNTRIES_QUERY = "create table countries (id bigint, name varchar(200), " +
            " primary key (id)) character set UTF8;";
    private static final String CREATE_COUNTRY_QUERY = "INSERT INTO countries (id, name) VALUES (?, ?)";
    private static final String READ_COUNTRY_QUERY = "Select * from countries where id = ?";
    private static final String UPDATE_COUNTRY_QUERY = "UPDATE countries SET name = ? WHERE id = ?";
    private static final String DELETE_COUNTRY_QUERY = "DELETE FROM countries where id = ?";
    private static final String READ_ALL_COUNTRIES_QUERY = "SELECT * FROM countries";


    public static void create(CountryDto country) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_COUNTRY_QUERY)) {
            statement.setLong(1, country.getApiCountryId());
            statement.setString(2, country.getName());
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
}
