package com.tuempresa.aerolinea.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo extends Identificable {
	
    @DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length=4)
	int anyo;
    
    
    
    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;
    
    @StringTime
    @Column(length=6)
    private String startTime;
    
    @ManyToOne
    @DescriptionsList
    CiudadOrigen ciudadOrigen;
    
    @ManyToOne
    @DescriptionsList
    CiudadDestino ciudadDestino;
    
	

}
