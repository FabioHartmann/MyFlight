import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;

    public GerenciadorCias(ArrayList<CiaAerea> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<CiaAerea> listarTodas() {
        return empresas;
    }

    public void adicionar(CiaAerea cia){
        empresas.add(cia);
    }


    public void setEmpresas(ArrayList<CiaAerea> empresas) {
        this.empresas = empresas;
    }

    public CiaAerea buscarPorCodigo(String cod){
//        AtomicReference<Aeronave> aviao = null;
//        aeronaves.forEach(aeronave -> {
//            if(aeronave.getCodigo() == cod) aviao.set(aeronave);
//        });
//        return aviao.get();
        CiaAerea searchedCia = null;
        for(CiaAerea cia: empresas){
            if(cia.getCodigo() == cod){
                searchedCia = cia;
            }
        }
        return searchedCia;
    }
    public CiaAerea buscarPorNome(String nome){
//        AtomicReference<Aeronave> aviao = null;
//        aeronaves.forEach(aeronave -> {
//            if(aeronave.getCodigo() == cod) aviao.set(aeronave);
//        });
//        return aviao.get();
        CiaAerea searchedCia = null;
        for(CiaAerea cia: empresas){
            if(cia.getNome() == nome){
                searchedCia = cia;
            }
        }
        return searchedCia;
    }
}
