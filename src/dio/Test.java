package dio;

import  dio.singleton.SingletonBasico;
import dio.singleton.SingletonHolder;
import dio.singleton.SingletonResumido;
import dio.strategy.*;

public class Test {
    public static void main(String[] args) {
        //testes relacionados ao Design Pattern Singleton:
        //Singleton
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

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}
