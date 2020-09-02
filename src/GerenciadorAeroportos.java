import java.util.ArrayList;
import java.util.Comparator;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(ArrayList<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }

    public ArrayList<Aeroporto> listarTodos() {
        return aeroportos;
    }

    public void setAeroportos(ArrayList<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }

    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public Aeroporto buscarPorCodigo(String cod){
//        AtomicReference<Aeronave> aviao = null;
//        aeronaves.forEach(aeronave -> {
//            if(aeronave.getCodigo() == cod) aviao.set(aeronave);
//        });
//        return aviao.get();
        Aeroporto aereo = null;
        for(Aeroporto aero: aeroportos){
            if(aero.getCodigo() == cod){
                aereo = aero;
            }
        }
        return aereo;
    }

    public ArrayList<Aeroporto> ordenaPorNome(){
        ArrayList<Aeroporto> sorted = aeroportos;
        sorted.sort(Comparator.comparing((Aeroporto::getNome)));
        return sorted;
    }
}
