import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(ArrayList<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public ArrayList<Aeronave> listarTodas() {
        return aeronaves;
    }

    public void adicionar(Aeronave aeronave){
        aeronaves.add(aeronave);
    }

    public Aeronave buscarPorCodigo(String cod){
//        AtomicReference<Aeronave> aviao = null;
//        aeronaves.forEach(aeronave -> {
//            if(aeronave.getCodigo() == cod) aviao.set(aeronave);
//        });
//        return aviao.get();
        Aeronave aero = null;
        for(Aeronave aviao: aeronaves){
            if(aviao.getCodigo() == cod){
                aero = aviao;
            }
        }
        return aero;
    }


}
