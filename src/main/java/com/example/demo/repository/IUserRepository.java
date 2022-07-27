package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User;

public interface IUserRepository extends JpaRepository<User,Long>{
    public abstract List<User> findByTypeDocumentAndDocumentIdentification(String typeDocument, String documentIdentification);
}
