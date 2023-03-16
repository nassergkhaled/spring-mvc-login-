package project.other;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import project.model.User;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("ID"));
        user.setName(resultSet.getString("NAME"));
        user.setEmail(resultSet.getString("EMAIL"));
        return user;
    }
}

