package dio.singleton;

public class SingletonResumido {

    private static SingletonResumido instancia = new SingletonResumido();

    private SingletonResumido(){
        super();
    }
    public static SingletonResumido getInstance(){
        return instancia;
    }
}

