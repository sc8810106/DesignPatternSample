package BehavioralPattern.TemplatePattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
