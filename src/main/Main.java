
package main;

import dao.UserDAO;
import model.User;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Create a new user
        userDAO.createUser("Alice", "alice@example.com");

        // Read all users
        List<User> users = userDAO.getAllUsers();
        for (User user : users) 
        {
            System.out.println(user);
        }

        // Update and Delete operations
    }
}
