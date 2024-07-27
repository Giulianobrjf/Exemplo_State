package org.example;

public class Proposta {
    private EstadoProposta estado;
    private String descricao;

    public Proposta(String descricao) {
        this.descricao = descricao;
        this.estado = NovaProposta.getInstance(); // Estado inicial
    }

    public void setEstado(EstadoProposta estado) {
        this.estado = estado;
    }

    public boolean aceitar() {
        return estado.aceitar(this);
    }

    public boolean recusar() {
        return estado.recusar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean enviarNova() {
        return estado.enviarNova(this);
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }
}
