import java.util.ArrayList;
import java.util.Comparator;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(ArrayList<Rota> rotas) {
        this.rotas = rotas;
    }

    public void adicionar(Rota rota){rotas.add(rota);}


    public ArrayList<Rota> ListarTodas() {
        return rotas;
    }

    public void setRotas(ArrayList<Rota> rotas) {
        this.rotas = rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
//        AtomicReference<Aeronave> aviao = null;
//        aeronaves.forEach(aeronave -> {
//            if(aeronave.getCodigo() == cod) aviao.set(aeronave);
//        });
//        return aviao.get();
        ArrayList<Rota> rotaOrigem = null;
        for(Rota rota: rotas){
            if(rota.getOrigem() == orig){
                rotaOrigem.add(rota);
            }
        }
        return rotaOrigem;
    }

    public ArrayList<Rota> ordenaPorNome(){
        ArrayList<Rota> sorted = rotas;
        sorted.sort(Comparator.comparing((Rota::getOrigem)));
        return sorted;
    }
}
