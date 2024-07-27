package org.example;

public class PropostaAceita extends EstadoProposta {

    private static PropostaAceita instance = new PropostaAceita();

    private PropostaAceita() {}

    public static PropostaAceita getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Proposta Aceita";
    }

    @Override
    public boolean suspender(Proposta proposta) {
        proposta.setEstado(PropostaSuspensa.getInstance());
        return true;
    }
}

