import java.time.LocalDateTime;
import java.time.Duration;

public abstract class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Status status;

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Voo(LocalDateTime datahora, Status status){
        this.datahora = datahora;
        this.status = status;
    }

    public Voo(  Status status){
        this.datahora = LocalDateTime.of(2016,8,12, 12,00);
        this.status = status;
    }

    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    public abstract Duration getDuracao();

    public abstract Rota getRota();

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
