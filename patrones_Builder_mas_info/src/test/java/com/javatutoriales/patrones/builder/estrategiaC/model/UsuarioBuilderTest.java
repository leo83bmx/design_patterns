package com.javatutoriales.patrones.builder.estrategiaC.model;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class UsuarioBuilderTest {
	@Test
	void usuarioCorrecto() {
		UsuarioBuilder usuarioBuilder = Usuario.builder("Programador Java", "programadorjava").password("123456")
				.nickname("Programador").telefono("12345780", TipoTelefono.MOVIL)
				.telefono("87654321", TipoTelefono.FIJO).direccion("Ficticia", "12345").calle("Calle")
				.numeroExterior(13).build();

		Usuario usuario = usuarioBuilder.build();

		assert (usuario.getNombre()).equals("Programador Java");
		assert (usuario.getUsername()).equals("programadorjava");
		assert (usuario.getPassword()).equals("123456");

		assert (usuario.getTelefonos()).size() == 2;

		assert (usuario.getDireccion().getCiudad()).equals("Ficticia");
		assert (usuario.getDireccion().getCodigoPostal()).equals("12345");
		assert (usuario.getDireccion().getCalle()).equals("Calle");
		assert (usuario.getDireccion().getNumeroExterior()) == 13;
	}

	@Test
	void excepcion_cuandoNoHayDireccion() {
		UsuarioBuilder usuarioBuilder = Usuario
				.builder("Programador Java", "programadorjava")
				.password("123456")
				.nickname("Programador")
				.telefono("12345780", TipoTelefono.MOVIL)
				.telefono("87654321", TipoTelefono.FIJO);

		assertThrows(IllegalStateException.class, () -> {
			usuarioBuilder.build();
		});

//        assertThatThrownBy(() -> {
//            Usuario usuario = usuarioBuilder.build();
//        }).isExactlyInstanceOf(IllegalStateException.class);
	}

	@Test
	void excepcion_cuandoNoHayTelefono() {
		UsuarioBuilder usuarioBuilder = Usuario
				.builder("Programador Java", "programadorjava")
				.password("123456")
				.nickname("Programador").telefono("12345780", TipoTelefono.MOVIL)
				.telefono("87654321", TipoTelefono.FIJO);

		assertThrows(IllegalStateException.class, () -> {
			usuarioBuilder.build();
		});

//        assertThatThrownBy(() -> {
//            Usuario usuario = usuarioBuilder.build();
//        }).isExactlyInstanceOf(IllegalStateException.class);
	}
}