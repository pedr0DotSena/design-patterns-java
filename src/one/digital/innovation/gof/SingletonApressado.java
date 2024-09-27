package one.digital.innovation.gof;
public class SingletonApressado {
    private static SingletonApressado instancia = new SingletonApressado();
    private SingletonApressado() {
        super();
    }
    public static SingletonApressado getInstancia() {
        return instancia;
    }
}