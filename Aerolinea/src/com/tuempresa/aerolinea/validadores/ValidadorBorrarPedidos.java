package com.tuempresa.aerolinea.validadores;

import org.openxava.util.*;
import org.openxava.validators.*;

import com.tuempresa.aerolinea.modelo.*;

public class ValidadorBorrarPedidos implements IRemoveValidator {
	
	 Vuelo vuelo;
	 
	 public void setEntity(Object entity) throws Exception{
		 this.vuelo =(Vuelo) entity;
	 }
	 
	 @Override
	 public void validate(Messages errors) throws Exception{
		 if(vuelo.getCiudadDestino() != null ) {
			 errors.add("no_se_puede_borrar_Vuelo");
		 }
	 }

}
