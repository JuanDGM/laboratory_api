package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table (name = "TBL_PRUEBAS")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "Campo obligatorio")
	@Column(name="PRU_NOMBRE_PRUEBA")
	private String nameTest;
    
	@Column(name="PRU_USUARIO_CREA")
	private String userAt;
	
	@Column(name="PRU_USUARIO_ACTUALIZA")
	private String userUpdatedAt;

	@Column(name="PRU_FECHA_CREACION")
	private String createdAt;
	
	@Column(name="PRU_FECHA_ACTUALIZACION")
	private String updatedAt;

	public Test () {
		
	}
	
	public Test(Long id, String nameTest) {
		this.id = id;
		this.nameTest = nameTest;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameTest() {
		return nameTest;
	}
	public void setNameTest(String nameTest) {
		this.nameTest = nameTest;
	}
}