import models.User;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserService();
        User user = new User("Misha", 26);
        userService.saveUser(user);
        userService.saveUser(new User("Vasya", 27));
        List<User> userList = userService.findAllUsers();
        for (User userFor:userList) {
            System.out.println(userFor);
        }
    }
}
