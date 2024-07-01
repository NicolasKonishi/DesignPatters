package Singleton.out.production.DesignPatters_Java.one.digitalinnovation.gof.gof;


/*
 * Singleton "Apressado"
 *
 * @author NicolasKOnishi
 */
public class SingletonEager {
    private static SingletonEager INSTANCE = new SingletonEager();
    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
