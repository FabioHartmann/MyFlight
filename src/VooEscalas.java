import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {
    private Rota rotaFinal;

    public Rota getRotaFinal() {
        return rotaFinal;
    }

    public void setRotaFinal(Rota rotaFinal) {
        this.rotaFinal = rotaFinal;
    }

    public VooEscalas(LocalDateTime datahora, Duration duracao, Rota escala, Rota rotaFinal, Status status) {
        super(datahora, duracao, escala, status);
        this.rotaFinal = rotaFinal;
    }
}
