package xanderson.edu.HomeBankAPI.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import xanderson.edu.HomeBankAPI.model.User;
import xanderson.edu.HomeBankAPI.model.repository.UserRepository;
import xanderson.edu.HomeBankAPI.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        
    }

    @Override
    public User create(User userTocreate) {
        if (userRepository.existsByAccountNumber(userTocreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This User Accont Number already exists.");
        }
        return userRepository.save(userTocreate);
        
    }
    
}
