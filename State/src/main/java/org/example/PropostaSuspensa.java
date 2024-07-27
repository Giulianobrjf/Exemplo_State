package org.example;

public class PropostaSuspensa extends EstadoProposta {

    private static PropostaSuspensa instance = new PropostaSuspensa();

    private PropostaSuspensa() {}

    public static PropostaSuspensa getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Proposta Suspensa";
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
}
