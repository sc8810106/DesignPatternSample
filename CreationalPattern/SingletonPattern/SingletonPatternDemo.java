package CreationalPattern.SingletonPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.showMessage();
    }
}
