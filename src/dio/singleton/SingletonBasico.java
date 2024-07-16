package dio.singleton;

public class SingletonBasico {

    private static SingletonBasico instancia;

    private SingletonBasico(){
        super();
    }
    public static SingletonBasico getInstance(){
        if(instancia == null){
            instancia = new SingletonBasico();

        }
        return instancia;
    }
}
