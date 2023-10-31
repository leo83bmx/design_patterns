package com.javatutoriales.patrones.builder.estrategiaC.model;

public class Direccion {
    private final String ciudad;
    private final String codigoPostal;
    private String calle;
    private int numeroExterior;
    private int numeroInterior;

    Direccion(String ciudad, String codigoPostal) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(int numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public int getNumeroInterior() {
		return numeroInterior;
	}

	public void setNumeroInterior(int numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}
    
    
    
    
}
