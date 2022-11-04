package com.tuempresa.aerolinea.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinea extends Identificable{
	
	
	 @Column(length=15)
	 @Required
	 String nombre;
	 
	 
	 
	 //@OneToMany(mappedBy="aerolinea")
	 //Collection<Tripulacion>tripulacion;
	 
	 @ManyToOne(fetch =FetchType.LAZY, optional = true)
	 @DescriptionsList
	 Pais pais;
	 
	 //@ManyToOne(fetch = FetchType.LAZY, optional = true)
	 //@DescriptionsList
	 //Tripulacion tripulacion;
 

}
