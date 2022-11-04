package com.tuempresa.aerolinea.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity @Getter @Setter
@View(members=
"precioBoleto, numeroDeAsiento")
public class Pasajero extends Identificable{
	
	
	
	@Stereotype("DINERO")
	BigDecimal precioBoleto;
    
	@Column(length=15)
	int numeroDeAsiento;
	
}
