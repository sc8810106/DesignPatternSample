package CreationalPattern.SingletonPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class Singleton {
    private static Singleton instance=new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return  instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
