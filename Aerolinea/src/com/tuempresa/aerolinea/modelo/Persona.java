package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(members=
"nombre, apellido;"+
"direccion;"+
"fotos")
public class Persona extends Identificable{

	@Column(length=32)
	@Required
	String nombre;
	
	@Column(length=32)
	String apellido;
	
	@Files
	@Column(length=32)
	String fotos;
	
	//@ManyToOne(fetch=FetchType.LAZY,optional=true)
	//@DescriptionsList
	//Pais pais;
	
	@Embedded
	Direccion direccion;
	
	
}
