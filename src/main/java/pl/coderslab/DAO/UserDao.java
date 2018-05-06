package pl.coderslab.DAO;

import pl.coderslab.DTO.UserDto;
import pl.coderslab.DbUtil;
import pl.coderslab.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {

    private static final String CREATE_TABLE_USERS_QUERY = "create table users (id bigint auto_increment, name varchar(200), " +
            "surname varchar (200), email varchar (200), password varchar(100), primary key (id)) character set UTF8;";
    private static final String CREATE_USER_QUERY = "INSERT INTO users (name, surname, email, password) VALUES (?, ?, ?, ?)";
    private static final String READ_USER_QUERY = "Select * from users where id = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE users SET name = ? , surname = ?, email = ?, password = ?  WHERE id = ?";
    private static final String DELETE_USER_QUERY = "DELETE FROM users where id = ?";
    private static final String READ_ALL_USERS_QUERY = "SELECT * FROM users";


    public static void create(UserDto user) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_USER_QUERY)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getSurname());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
}
