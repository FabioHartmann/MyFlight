public class Rota implements Comparable {
    private CiaAerea cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) throws Exception {
        if(cia == null || origem == null || destino == null || aeronave == null) throw new Exception("Erro ao criar Rota");
        this.cia = cia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    public CiaAerea getCia() {
        return cia;
    }

    public void setCia(CiaAerea cia) {
        this.cia = cia;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(o);
    }
}
