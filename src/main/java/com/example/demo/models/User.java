package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table (name = "TBL_USUARIOS")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    @Column(name="USU_NOMBRE")
	private String name;
    
    @Column(name="USU_APELLIDO")
	private String lastName;
    
    @Column(name="USU_TIPO_DOCUMENTO")
	private String typeDocument;

	@Column(name="USU_DOCUMENTO")
	private String documentIdentification;

    @Column(name="USU_CORREO")
	private String email;
    
    @Column(name="USU_AZUCAR")
	private Double sugar;
    
    @Column(name="USU_GRASA")
	private Double fat;
    
    @Column(name="USU_OXIGENO")
	private Double oxygen;
	
    @Column(name="USU_NIVEL_RIESGO")
	private String levelRisk;
    
	@Column(name="USU_USUARIO_CREA")
	private String userAt;
	
	@Column(name="USU_USUARIO_ACTUALIZA")
	private String userUpdatedAt;

	@Column(name="USU_FECHA_CREACION")
	private String createdAt;
	
	@Column(name="USU_FECHA_ACTUALIZACION")
	private String updatedAt;

	public User () {
		
	}
	
	public User(Long id, String name, String lastName, String typeDocument, String documentIdentification, String email, Double sugar, Double fat, Double oxygen, String levelRisk) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.typeDocument= typeDocument;
		this.documentIdentification=documentIdentification;
		this.email = email;
		this.sugar = sugar;
		this.fat = fat;
		this.oxygen = oxygen;
		
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public String getDocumentIdentification() {
		return documentIdentification;
	}
	public void setDocumentIdentification(String documentIdentification) {
		this.documentIdentification = documentIdentification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSugar() {
		return sugar;
	}
	public void setSugar(Double sugar) {
		this.sugar = sugar;
	}
	public Double getFat() {
		return fat;
	}
	public void setFat(Double fat) {
		this.fat = fat;
	}
	public Double getOxygen() {
		return oxygen;
	}
	public void setOxygen(Double oxygen) {
		this.oxygen = oxygen;
	}
	public String getLevelRisk() {
		return levelRisk;
	}
	public void setLevelRisk(String levelRisk) {
		this.levelRisk = levelRisk;
	}
	
}