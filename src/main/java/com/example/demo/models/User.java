package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "TBL_USUARIOS")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    @Column(name="USU_NOMBRE")
	private String name;
    
    @Column(name="USU_APELLIDO")
	private String surname;
    
    @Column(name="USU_DOCUMENTO")
	private String document;

    @Column(name="USU_CORREO")
	private String email;
    
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "RES_TBL_USUARIOS_ID", referencedColumnName = "RES_TBL_USUARIOS_ID")
	private Result result;	


    @Column(name="USU_AZUCAR")
	private Float sugar;
    
    @Column(name="USU_GRASA")
	private Float fat;
    
    @Column(name="USU_OXIGENO")
	private Float oxygen;
	
    @Column(name="USU_NIVEL_RIESGO")
	private String levelRisk;
	
	public User () {
		
	}
	
	public User(Long id, String name, String surname, String email, Float sugar, Float fat, Float oxygen, String levelRisk) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.sugar = sugar;
		this.fat = fat;
		this.oxygen = oxygen;
		this.levelRisk = levelRisk;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getSugar() {
		return sugar;
	}
	public void setSugar(Float sugar) {
		this.sugar = sugar;
	}
	public Float getFat() {
		return fat;
	}
	public void setFat(Float fat) {
		this.fat = fat;
	}
	public Float getOxygen() {
		return oxygen;
	}
	public void setOxygen(Float oxygen) {
		this.oxygen = oxygen;
	}
	public String getLevelRisk() {
		return levelRisk;
	}
	public void setLevelRisk(String levelRisk) {
		this.levelRisk = levelRisk;
	}
	
}