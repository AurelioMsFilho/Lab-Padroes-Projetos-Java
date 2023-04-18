package one.digitalinnovation.gf;

import one.digitalinnovation.gf.singleton.SingletonEager;
import one.digitalinnovation.gf.singleton.SingletonLazy;
import one.digitalinnovation.gf.singleton.SingletonLazyHolder;
import one.digitalinnovation.gf.strategy.*;

public class test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        lazyHolder=SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defesa = new ComportamentoDefensivo();
        Comportamento ataque = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defesa);
        robo.mover();
        robo.mover();

        robo.setComportamento(ataque);
        robo.mover();
        robo.mover();


            }
}
