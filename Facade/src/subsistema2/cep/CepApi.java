package subsistema2.cep;

public class CepApi {
    private static CepApi INSTANCE =new CepApi();

    private CepApi(){

    }
    public static CepApi getInstance(){
        return INSTANCE;
    }

    public String recuperarCidade(String cep){
        return "Cotia";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }

}
