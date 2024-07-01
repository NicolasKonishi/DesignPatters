import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String estado = CepApi.getInstance().recuperarEstado(cep);
        String cidade = CepApi.getInstance().recuperarCidade(cep);

        CrmService.gravarCliente(nome,cep, cidade,estado);
    }
}
