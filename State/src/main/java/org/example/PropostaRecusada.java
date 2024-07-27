package org.example;


public class PropostaRecusada extends EstadoProposta {

    private static PropostaRecusada instance = new PropostaRecusada();

    private PropostaRecusada() {}

    public static PropostaRecusada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Proposta Recusada";
    }

    @Override
    public boolean enviarNova(Proposta proposta) {
        proposta.setEstado(NovaProposta.getInstance());
        return true;
    }
}
