package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class CiudadDestino extends Identificable{

	@Column(length=15)
	String nombre;
}
