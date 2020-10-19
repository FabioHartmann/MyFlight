public class Aeronave implements Contavel {
    private String codigo;
    private String descricao;
    private int capacidade;
    private int totalCias;

    public Aeronave(String codigo, String descricao, int capacidade) throws Exception {
        if(codigo.isEmpty() || descricao.isEmpty() || capacidade < 1) throw new Exception("Erro ao criar Aeronave");
            totalCias++;
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

    @Override
    public int getTotalCias() {
        return totalCias;
    }
}
