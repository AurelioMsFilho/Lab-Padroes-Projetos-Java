package one.digitalinnovation.gf.facade;

import subsistema1.crm.CrmService;
import subssistema2.cep.CepApi;

public class facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);

    }
}
