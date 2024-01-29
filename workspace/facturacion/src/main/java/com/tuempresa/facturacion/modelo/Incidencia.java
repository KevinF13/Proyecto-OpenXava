package com.tuempresa.facturacion.modelo;

import lombok.*;

@Getter @Setter

public class Incidencia {
	// Propiedad persistente
	@Getter @Setter // Tiene getter y setter
	int cantidad; // Tiene un campo, por tanto es persistente
	@Getter @Setter // Tiene getter y setter
	int precio; // Tiene un campo, por tanto es persistente
	
	// Propiedad calculada
	public int getImporte() { // No tiene campo, ni setter, solo un getter
	    return cantidad * precio; // con un cálculo
	}
}
