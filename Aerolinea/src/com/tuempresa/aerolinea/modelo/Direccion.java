package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {
	
	@Column(length=32)
	String calle;
	
	@Column(length=32)
	String colonia;
	
	//@Column(length=32)
	//String municipio;
	
	//@Column(length=32)
	//String estado;
	
	@ManyToOne
	@DescriptionsList
	Municipio municipio;
	
	@ManyToOne
	@DescriptionsList
	Estado estado;
	
	
	/*@ManyToOne(fetch=FetchType.LAZY,optional=true)
	@DescriptionsList
	Pais pais;*/
	
}
