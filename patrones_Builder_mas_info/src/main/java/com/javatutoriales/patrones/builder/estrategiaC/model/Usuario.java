package com.javatutoriales.patrones.builder.estrategiaC.model;

import java.util.Set;

public class Usuario {
    private final String nombre;
    private final String username;
    private String password;
    private short edad;
    private String nickname;

    private Direccion direccion;
    private Set<Telefono> telefonos;

    Usuario(String nombre, String username) {
        this.nombre = nombre;
        this.username = username;
    }
    

    public static UsuarioBuilder builder(String nombre, String username){
        return new UsuarioBuilder(nombre, username);
    }


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public short getEdad() {
		return edad;
	}


	public void setEdad(short edad) {
		this.edad = edad;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public Set<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}


	public String getNombre() {
		return nombre;
	}


	public String getUsername() {
		return username;
	}
    
    
}
