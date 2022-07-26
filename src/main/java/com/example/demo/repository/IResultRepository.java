package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Result;

public interface IResultRepository extends JpaRepository<Result,Serializable> {
    
}
