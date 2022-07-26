package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_RESULTADOS")
public class Result implements Serializable{
    
    @Id
    @Column(name="RES_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="RES_TBL_USUARIOS_ID")
    private Integer userId;
    
    @Column(name="RES_AZUCAR")
	private Float sugar;
    
    @Column(name="RES_GRASA")
	private Float fat;
    
    @Column(name="RES_OXIGENO")
	private Float oxygen;
	
    @Column(name="RES_NIVEL_RIESGO")
	private String levelRisk;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "result")
    private List<User> user;


    public Result(){

    }

    public Result(Long id, Integer userId, Float sugar, Float fat, Float oxygen, String levelRisk) {
		this.id = id;
		this.userId = userId;
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
