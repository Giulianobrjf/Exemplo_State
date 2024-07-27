import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropostaTest {
    Proposta proposta;

    @BeforeEach
    public void setUp() {
        proposta = new Proposta("Descrição da Proposta");
    }

    @Test
    public void deveRetornarDescricaoCorreta() {
        assertEquals("Descrição da Proposta", proposta.getDescricao());
    }

    @Test
    public void deveAprovarPropostaNova() {
        proposta.setEstado(NovaProposta.getInstance());
        assertTrue(proposta.aceitar());
        assertEquals("Proposta Aceita", proposta.getEstado());
    }

    @Test
    public void deveRejeitarPropostaNova() {
        proposta.setEstado(NovaProposta.getInstance());
        assertTrue(proposta.recusar());
        assertEquals("Proposta Recusada", proposta.getEstado());
    }

    @Test
    public void deveSuspenderPropostaNova() {
        proposta.setEstado(NovaProposta.getInstance());
        assertTrue(proposta.suspender());
        assertEquals("Proposta Suspensa", proposta.getEstado());
    }

    @Test
    public void deveSuspenderPropostaAceita() {
        proposta.setEstado(PropostaAceita.getInstance());
        assertTrue(proposta.suspender());
        assertEquals("Proposta Suspensa", proposta.getEstado());
    }

    @Test
    public void naoDeveAceitarPropostaRecusada() {
        proposta.setEstado(PropostaRecusada.getInstance());
        assertFalse(proposta.aceitar());
        assertEquals("Proposta Recusada", proposta.getEstado());
    }

    @Test
    public void deveEnviarNovaPropostaRecusada() {
        proposta.setEstado(PropostaRecusada.getInstance());
        assertTrue(proposta.enviarNova());
        assertEquals("Nova Proposta", proposta.getEstado());
    }

    @Test
    public void deveAceitarPropostaSuspensa() {
        proposta.setEstado(PropostaSuspensa.getInstance());
        assertTrue(proposta.aceitar());
        assertEquals("Proposta Aceita", proposta.getEstado());
    }

    @Test
    public void deveRecusarPropostaSuspensa() {
        proposta.setEstado(PropostaSuspensa.getInstance());
        assertTrue(proposta.recusar());
        assertEquals("Proposta Recusada", proposta.getEstado());
    }

    @Test
    public void naoDeveEnviarNovaPropostaNova() {
        proposta.setEstado(NovaProposta.getInstance());
        assertFalse(proposta.enviarNova());
        assertEquals("Nova Proposta", proposta.getEstado());
    }
}
