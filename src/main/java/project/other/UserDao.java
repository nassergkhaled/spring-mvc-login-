package project.other;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.model.User;

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> getAllUsers() {
        return this.jdbcTemplate.query("SELECT * FROM USERS", new UserRowMapper());
    }

    public User getUserById(int id) {
        return this.jdbcTemplate.queryForObject("SELECT * FROM USERS WHERE ID=?", new Object[]{id}, new UserRowMapper());
    }
}
