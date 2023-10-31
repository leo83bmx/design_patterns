package com.javatutoriales.patrones.builder.estrategiaB.model;

public class Usuario {

	private final String nombre;
	private final String username;
	private String password;
	private short edad;
	private String nickname;

	private Usuario(String nombre, String username) {
		this.nombre = nombre;
		this.username = username;
	}

	public static UsuarioBuilder builder(String nombre, String username) {
		return new UsuarioBuilder(nombre, username);
	}

	public static class UsuarioBuilder {

		private final Usuario usuario;

		private UsuarioBuilder(String nombre, String username) {
			usuario = new Usuario(nombre, username);
		}

		public UsuarioBuilder password(String password) {
			usuario.password = password;
			return this;
		}

		public UsuarioBuilder edad(short edad) {
			usuario.edad = edad;
			return this;
		}

		public UsuarioBuilder nickname(String nickname) {
			usuario.nickname = nickname;
			return this;
		}

		public Usuario build() {
			return this.usuario;
		}

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

	public String getNombre() {
		return nombre;
	}

	public String getUsername() {
		return username;
	}

}
