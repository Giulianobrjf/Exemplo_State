package org.example;

public abstract class EstadoProposta {
    public abstract String getEstado();

    public boolean aceitar(Proposta proposta) {
        return false;
    }

    public boolean recusar(Proposta proposta) {
        return false;
    }

    public boolean suspender(Proposta proposta) {
        return false;
    }

    public boolean enviarNova(Proposta proposta) {
        return false;
    }
}