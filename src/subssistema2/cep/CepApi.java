package subssistema2.cep;

/**
 * @author: https://github.com/AurelioMsFilho
 */
import one.digitalinnovation.gf.singleton.SingletonLazy;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return  instancia;
    }

    public String recuperarCidade(String cep){
        return "Fortaleza";

    }
    public String recuperarEstado(String cep){
        return "CE";

    }

}
