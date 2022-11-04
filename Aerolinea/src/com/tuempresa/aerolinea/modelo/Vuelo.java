package com.tuempresa.aerolinea.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter

@View(members=
		"anyo, fecha, startTime;"+
		"ciudadOrigen;"+
		"ciudadDestino"
				)
@RemoveValidator(com.tuempresa.aerolinea.validadores.ValidadorBorrarPedidos.class)
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
    
    /*@PrePersist
	private void calcularNumero() {
		Query query = XPersistence.getManager().createQuery(
				"select max(f.numero) from "+
			    getClass().getSimpleName()+
				"f where f.anyo = :anyo");
			query.setParameter("anyo", anyo);
			Integer ultimoNumero = (Integer) query.getSingleResult();
			this.numero = ultimoNumero == null ? 1: ultimoNumero + 1;
	}*/

}
