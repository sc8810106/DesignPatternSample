package CreationalPattern.BuilderPattern;

/**
 * Created by Administrator on 2019/2/24.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuider mealBuider = new MealBuider();
        Meal meal1 = mealBuider.prepareMeal1();
        System.out.println("Meal1");
        meal1.showItems();
        System.out.println("Total Cost: " + meal1.getCost());

        Meal meal2 = mealBuider.prepareMeal2();
        System.out.println("\n\nMeal2");
        meal2.showItems();
        System.out.println("Total Cost: " + meal2.getCost());
    }
}
