import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
    private Rota rota;

    public VooDireto(LocalDateTime datahora, Status status) {
        super(datahora, status);
        this.rota = rota;
    }

    @Override
    public Duration getDuracao() {
        double calculoDuracao = Geo.distancia(this.rota.getOrigem().getLoc(), this.rota.getDestino().getLoc()) / 805.0 + 0.30;
        return Duration.ofHours((long) calculoDuracao) ;
    }
    @Override
    public Rota getRota() {
        return rota;
    }
}
