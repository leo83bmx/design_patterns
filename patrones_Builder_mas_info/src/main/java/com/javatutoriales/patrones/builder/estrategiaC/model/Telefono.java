package com.javatutoriales.patrones.builder.estrategiaC.model;

public class Telefono {
	
    private final String numero;
    private final TipoTelefono tipoTelefono;

    Telefono(String numero, TipoTelefono tipoTelefono) {
        this.numero = numero;
        this.tipoTelefono = tipoTelefono;
    }

	public String getNumero() {
		return numero;
	}

	public TipoTelefono getTipoTelefono() {
		return tipoTelefono;
	}
    
    
}
