package one.digitalinnovation.gf.singleton;
/**
 * @see < href="https://stackoverflow.com/a/24018148"></a>
 *
 * @author: https://github.com/AurelioMsFilho
 */
public class SingletonLazyHolder {
    public static class  InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }
    private SingletonLazyHolder(){
        super ();
    }

    public static SingletonLazyHolder getInstancia(){
        return  InstanceHolder.instancia;
    }
}
