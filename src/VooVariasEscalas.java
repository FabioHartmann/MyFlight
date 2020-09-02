import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends VooEscalas {
    private Rota segundaEscala;

    public VooVariasEscalas(LocalDateTime datahora, Duration duracao, Rota escala, Rota segundaEscala, Rota rotaFinal, Status status) {
        super(datahora, duracao, escala, rotaFinal, status);
        this.segundaEscala = segundaEscala;
    }

    public Rota getSegundaEscala() {
        return segundaEscala;
    }

    public void setSegundaEscala(Rota segundaEscala) {
        this.segundaEscala = segundaEscala;
    }
}
