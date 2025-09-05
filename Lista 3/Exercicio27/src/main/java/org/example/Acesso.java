package org.example;

import java.time.LocalDate;

public class Acesso {
    private String usuario;
    private LocalDate data;

    public Acesso(String usuario, LocalDate data) {
        this.usuario = usuario;
        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "usuario='" + usuario + '\'' +
                ", data=" + data +
                '}';
    }
}
