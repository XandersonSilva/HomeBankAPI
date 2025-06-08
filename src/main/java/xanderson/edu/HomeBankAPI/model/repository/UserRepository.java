package xanderson.edu.HomeBankAPI.model.repository;

import xanderson.edu.HomeBankAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String accountNumber);
}
