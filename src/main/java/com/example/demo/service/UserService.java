package com.example.demo.service;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.IUserRepository;

@Service
public class UserService {
    
    @Autowired
    private IUserRepository userRepository;
    
    @Autowired
    private IResulRepository resultRepository;
    
    public User create(User user){
        String levelRisk = this.calculateLevelRisk(user);
        user.setLevelRisk(levelRisk);
        User data = userRepository.save(user);
        resultRepository.save();   
        return data;
    }

    


    public List<User>getAllUsers(){
        return userRepository.findAll();
    }
    
    public void delete(User user){
        userRepository.delete(user);
    }

    public Optional<User> findById (Long id){
        return userRepository.findById(id);
    }


    private String calculateLevelRisk(User user){

        Float sugar = user.getSugar();
        Float fat = user.getFat();
        Float oxygen = user.getOxygen();

        if(sugar>70 && fat>88.5 && oxygen<60){
            return "ALTO";
        }else if(sugar<50 && fat<62.2 && oxygen<70){
            return "BAJO";
        }else{
            return "MEDIO";
        }        
    }
}
