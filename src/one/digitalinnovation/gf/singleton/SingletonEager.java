package one.digitalinnovation.gf.singleton;
/**
 * @author: https://github.com/AurelioMsFilho
 */

public class SingletonEager {
    private static SingletonEager instancia;

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
        if (instancia == null){
            instancia = new SingletonEager();
        }
        return instancia;
    }


}