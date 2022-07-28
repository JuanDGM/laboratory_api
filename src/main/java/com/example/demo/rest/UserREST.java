package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.service.UserService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/user")
public class UserREST {

    @Autowired
    private UserService userService;

    @Operation(summary = "Almacena la información del paciente y sus resultados de laboratorio")
    @PostMapping("/create")
    private ResponseEntity save(@Valid @RequestBody User user, BindingResult bindingResult) {
        
        if(bindingResult.hasErrors()){
            
            return  ResponseEntity.ok(bindingResult.getAllErrors());
        }
        try {
            User newUser = userService.create(user);
            
            return ResponseEntity.created(new URI("/api/user/create" + newUser.getId())).body(newUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @Operation(summary = "Obtiene la información de todos los resultados y usuarios registrados")
    @GetMapping
    private ResponseEntity<List<User>> listAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
   
    @Operation(summary = "Obtiene la información del usuario y sus resultados buscado por documento y tipo de documento")
    @GetMapping (value = "{name}")
    private ResponseEntity<List<User>> getUserByFilters(@RequestParam("identificationType") String identificationType, @RequestParam("documentIdentification") String documentIdentification) {
        return ResponseEntity.ok(userService.findByFilters(identificationType,documentIdentification));
    }
}
