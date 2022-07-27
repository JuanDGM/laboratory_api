package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.IUserRepository;

@Service
public class UserService {
    
    @Autowired
    private IUserRepository userRepository;

    public User create(User user){
        
        String levelRisk = this.calculateLevelRisk(user);
        user.setLevelRisk(levelRisk);
        return userRepository.save(user);
   }

    public List<User>getAllUsers(){
        return userRepository.findAll();
    }
    
    public List<User> findByFilters (String typeDocument, String documentIdentification){
        return userRepository.findByTypeDocumentAndDocumentIdentification(typeDocument, documentIdentification);
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