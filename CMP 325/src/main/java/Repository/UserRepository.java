package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

@Repository
public interface UserRepository<User> extends JpaRepository<User, Long> {
    User findByFullName(String fullName);
}