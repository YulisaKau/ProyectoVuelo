package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter

public class Pais extends Identificable{
	
	
	@Column(length=15)
	String nombre;
	
	
	
	
}
