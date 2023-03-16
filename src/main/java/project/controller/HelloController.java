package project.controller;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import project.model.User;
import project.other.UserDao;

import java.util.List;

@Controller
public class HelloController {

    private UserDao userDAO;

    @Autowired
    private UserDao userDao;

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userDao.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
    @GetMapping("/")
    public String home (Model model)
    {
        return "home";
    }

}
