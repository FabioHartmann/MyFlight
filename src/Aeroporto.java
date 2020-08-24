public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Geo getLoc() {
        return loc;
    }

    public void setLoc(Geo loc) {
        this.loc = loc;
    }

    public Aeroporto(String codigo, String nome, Geo loc) {
        this.codigo = codigo;
        this.nome = nome;
        this.loc = loc;
    }
}
