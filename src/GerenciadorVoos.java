import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }

    public void adicionar(Voo voo){voos.add(voo);}


    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public void setVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }


    public  ArrayList<Voo> buscarData(LocalDateTime data){
//        AtomicReference<Aeronave> aviao = null;
//        aeronaves.forEach(aeronave -> {
//            if(aeronave.getCodigo() == cod) aviao.set(aeronave);
//        });
//        return aviao.get();
        ArrayList<Voo> voosNaData = null;
        for(Voo voo: voos){
            if(voo.getDatahora() == data){
                voosNaData.add(voo);
            }
        }
        return voosNaData;
    }
}
