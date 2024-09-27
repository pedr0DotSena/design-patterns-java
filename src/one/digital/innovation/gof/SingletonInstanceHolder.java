package one.digital.innovation.gof;

public class SingletonInstanceHolder {
    private static class InstanceHolder {
        public static SingletonInstanceHolder instancia = new SingletonInstanceHolder();
    }
    private SingletonInstanceHolder() {
        super();
    }
    public static SingletonInstanceHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
