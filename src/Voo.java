import java.time.LocalDateTime;
import java.time.Duration;

public class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status){
        this.datahora = datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    public Voo( Duration duracao, Rota rota, Status status){
        this.datahora = LocalDateTime.of(2016,8,12, 12,00);
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }


    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
