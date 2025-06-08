package xanderson.edu.HomeBankAPI.service;

import org.springframework.stereotype.Service;

import xanderson.edu.HomeBankAPI.model.User;

@Service
public interface UserService {
    User findById(Long id);
    
    User create(User userTocreate);
}
