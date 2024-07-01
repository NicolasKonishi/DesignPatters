package Singleton.out.production.DesignPatters_Java.one.digitalinnovation.gof.gof;

public class SingletonLazyHolder {
    private static class Holder{
        public static SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){

    }
    public static SingletonLazyHolder getInstance(){
        return Holder.INSTANCE;
    }
}
