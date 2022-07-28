package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table (name = "TBL_CONFIGURACION_PRUEBAS")
public class TestConfig {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "Campo obligatorio")
	@Column(name="CON_NOMBRE_GRUPO_PRUEBAS")
	private String groupTestName;
	
	@NotBlank(message = "Campo obligatorio")
	@Column(name="CON_PRUEBA_ID")
	private Integer testId;
    
    @Column(name="CON_OPERATION")
	private String operation;
    
	@NotBlank(message = "Campo obligatorio")
    @Column(name="CON_VALOR_ONE")
	private Double valueOne;
	
	@Column(name="CON_VALOR_TWO")
	private Double valueTwo;
	
    @Column(name="CON_NIVEL_RIESGO")
	private String levelRisk;
    
	@Column(name="CON_USUARIO_CREA")
	private String userAt;
	
	@Column(name="CON_USUARIO_ACTUALIZA")
	private String userUpdatedAt;

	@Column(name="CON_FECHA_CREACION")
	private String createdAt;
	
	@Column(name="CON_FECHA_ACTUALIZACION")
	private String updatedAt;

	public TestConfig () {
		
	}
	
	public TestConfig(Long id, String groupTestName, Integer testId, String operation, Double valueOne, Double valueTwo, String levelRisk) {
		this.id = id;
		this.groupTestName = groupTestName;
		this.testId = testId;
		this.operation = operation;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
		this.levelRisk = levelRisk;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGroupTestName() {
		return groupTestName;
	}
	public void setGroupTestName(String groupTestName) {
		this.groupTestName = groupTestName;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public Double getvalueOne() {
		return valueOne;
	}
	public void setValueOne(Double valueOne) {
		this.valueOne = valueOne;
	}
	public Double getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(Double valueTwo) {
		this.valueTwo = valueTwo;
	}
	public String getLevelRisk() {
		return levelRisk;
	}
	public void setLevelRisk(String levelRisk) {
		this.levelRisk = levelRisk;
	}
	
}