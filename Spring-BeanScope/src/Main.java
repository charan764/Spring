public class Main{
  public static void main(String[] args){
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());


  }
}
class Singleton{
  private static final Singleton instance = new Singleton();

  private Singleton() {
    System.out.println("It will create only one object of a class in a Spring Container");
  }
  public static Singleton getInstance(){
    return instance;

  }
}