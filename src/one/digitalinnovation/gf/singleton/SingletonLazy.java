package one.digitalinnovation.gf.singleton;
/**
 * @author: https://github.com/AurelioMsFilho
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }


}
