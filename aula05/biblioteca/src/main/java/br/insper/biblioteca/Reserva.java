package br.insper.biblioteca;

import java.time.LocalDateTime;

public class Reserva {
    private String codigo;
    private LocalDateTime localDateTime;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
