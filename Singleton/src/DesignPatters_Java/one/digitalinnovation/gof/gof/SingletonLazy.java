package Singleton.out.production.DesignPatters_Java.one.digitalinnovation.gof.gof;

/**
 *
 * Singleton "Preguiçoso"
 * @author NicolasKOnishi
 *
 * */

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
