package CreationalPattern.BuilderPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class MealBuider {

    public Meal prepareMeal1() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public Meal prepareMeal2() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Sprite());
        return meal;
    }
}
