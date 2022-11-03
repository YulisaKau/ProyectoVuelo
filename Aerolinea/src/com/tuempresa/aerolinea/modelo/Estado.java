package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Estado extends Identificable{
	
	@Column(length=26)
	String nombre;

}
