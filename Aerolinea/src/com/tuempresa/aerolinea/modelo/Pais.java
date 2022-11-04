package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Pais extends Identificable{
	
	
	@Column(length=15)
	String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList
	Aerolinea aerolinea;
	
	
	
	
}
