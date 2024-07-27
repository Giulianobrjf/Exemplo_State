package org.example;

public class NovaProposta extends EstadoProposta {

    private static NovaProposta instance = new NovaProposta();

    private NovaProposta() {}

    public static NovaProposta getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Nova Proposta";
    }

    @Override
    public boolean aceitar(Proposta proposta) {
        proposta.setEstado(PropostaAceita.getInstance());
        return true;
    }

    @Override
    public boolean recusar(Proposta proposta) {
        proposta.setEstado(PropostaRecusada.getInstance());
        return true;
    }

    @Override
    public boolean suspender(Proposta proposta) {
        proposta.setEstado(PropostaSuspensa.getInstance());
        return true;
    }

    @Override
    public boolean enviarNova(Proposta proposta) {
        return false; // Já está em Nova Proposta
    }
}