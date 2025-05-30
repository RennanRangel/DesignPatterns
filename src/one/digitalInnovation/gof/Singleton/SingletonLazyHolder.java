package one.digitalInnovation.gof.Singleton;

public class SingletonLazyHolder {

   private static class IntansceHolder{
       public static SingletonLazyHolder instancia = new SingletonLazyHolder();
   }
  private SingletonLazyHolder(){
       super();
  }
  public static SingletonLazyHolder getInstance(){
       return IntansceHolder.instancia;
  }

}
