package com.javatutoriales.patrones.builder.estrategiaB.model;

import org.junit.jupiter.api.Test;

class UsuarioBuilderTest {
    @Test
    void usuarioCorrecto() {
    	
        Usuario.UsuarioBuilder usuarioBuilder = Usuario.builder("Programador Java", "programadorjava")
                .password("123456")
                .nickname("Programador");

        Usuario usuario = usuarioBuilder.build();

        assert(usuario.getNombre()).equals("Programador Java");
        assert(usuario.getUsername()).equals("programadorjava");
        assert(usuario.getPassword()).equals("123456");
    }
}