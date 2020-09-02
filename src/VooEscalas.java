import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {
    private ArrayList<Rota> rotas;

    public VooEscalas(LocalDateTime datahora, Status status, ArrayList<Rota> rotas) {
        super(datahora, status);
        this.rotas = rotas;
    }

    public void adicionaRota(Rota rota){
        rotas.add(rota);
    }

    @Override
    public Duration getDuracao() {
        double calculoDuracao = 0;
        for(Rota rota: rotas){
            calculoDuracao = calculoDuracao + Geo.distancia(rota.getOrigem().getLoc(), rota.getDestino().getLoc()) / 805.0 + 0.30;
        }

        return Duration.ofHours((long) calculoDuracao) ;
    }

    @Override
    public Rota getRota() {
        return rotas.get(0);
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }
}
