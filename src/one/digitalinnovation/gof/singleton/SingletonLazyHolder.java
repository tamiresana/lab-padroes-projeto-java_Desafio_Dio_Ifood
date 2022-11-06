package one.digitalinnovation.gof.singleton;

/**
 * Singleton "LazyHolder"
 *
 * @see <a href="http://stackoverflow.com/a/24018148">Referencia</a>
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
       public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        
        return InstanceHolder.instancia;
    }
}
