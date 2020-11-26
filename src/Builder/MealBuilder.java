package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:34
 * @version:1.0
 */
public class MealBuilder {
    //套餐a
    public Meal SetMealA(){
        Meal meal = new Meal();
        meal.addMeal(new VegBurger());
        meal.addMeal(new Coke());
        return meal;
    }
    //套餐b
    public Meal SetMealB(){
        Meal meal = new Meal();
        meal.addMeal(new MeatBurger());
        meal.addMeal(new Pepsi());
        return meal;
    }
}
