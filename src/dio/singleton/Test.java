package dio.singleton;

public class Test {
    public static void main(String[] args) {
        //testes relacionados ao Design Pattern Singleton:

        SingletonBasico basico = SingletonBasico.getInstance();
        System.out.println(basico);
        basico = SingletonBasico.getInstance();
        System.out.println(basico);

        SingletonResumido resumido = SingletonResumido.getInstance();
        System.out.println(resumido);
        resumido = SingletonResumido.getInstance();
        System.out.println(resumido);

        SingletonHolder holder = SingletonHolder.getInstance();
        System.out.println(holder);
        holder = SingletonHolder.getInstance();
        System.out.println(holder);
    }
}
