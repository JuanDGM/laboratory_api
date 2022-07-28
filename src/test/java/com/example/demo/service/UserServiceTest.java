package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.models.User;
import com.example.demo.repository.IUserRepository;


public class UserServiceTest {

    @Mock
    private IUserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private User user;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        user = new User();
        user.setName("Juan");
        user.setEmail("");
        user.setFat(100.0);
        user.setOxygen(89.0);
        user.setSugar(70.0);
        user.setTypeDocument("CC");
        user.setDocumentIdentification("123");
        
    }

    @Test
    void FindByFilters() {
        when(userRepository.findAll()).thenReturn(Arrays.asList(user));
        assertNotNull(userService.findByFilters("CC", "123"));
    }
    
    
    @Test
    void GetAllUsers() {
        when(userRepository.findAll()).thenReturn(Arrays.asList(user));
        assertNotNull(userService.getAllUsers());
    }
    
    @Test
    void createUser() {
        when(userRepository.save(user)).thenReturn(user);
        assertNotNull(userService.create(user));
    }
   
    

}
