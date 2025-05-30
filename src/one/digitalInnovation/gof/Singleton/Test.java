package one.digitalInnovation.gof.Singleton;

import one.digitalInnovation.gof.Facade.Facade;
import one.digitalInnovation.gof.Strategy.Comportamento;
import one.digitalInnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalInnovation.gof.Strategy.ComportamentoNormal;
import one.digitalInnovation.gof.Strategy.Robo;

import static java.util.Calendar.getInstance;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(eager);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal1 = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal1);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Rennan","2839392","Camaçari","Bahia");

    }

}
