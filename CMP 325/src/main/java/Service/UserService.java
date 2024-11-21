package Service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    <User> User createUser(User user);
    <User> User updateUser(User user);
    <User> List<User> getAllUsers();
}