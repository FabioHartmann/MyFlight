public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigo, String descricao, int capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}