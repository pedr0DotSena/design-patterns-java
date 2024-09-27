package one.digital.innovation.gof;


// TESTES DE DESIGN PATTERNS SINGLETON:
public class Test {
    public static void main(String[] args){
        SingletonPreguicoso preguicoso = SingletonPreguicoso.getInstancia();
        System.out.println(preguicoso);
        preguicoso = SingletonPreguicoso.getInstancia();
        System.out.println(preguicoso);

        SingletonApressado apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);
        apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);

        SingletonInstanceHolder holder = SingletonInstanceHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonInstanceHolder.getInstancia();
        System.out.println(holder);
    }
}
