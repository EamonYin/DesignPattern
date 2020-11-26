package Builder;

/**
 * @author:YiMing
 * @create:2020/11/26,20:37
 * @version:1.0
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal mealA = mealBuilder.SetMealA();
        System.out.println("套餐A：");
        mealA.showItems();
        System.out.println("总花费："+mealA.getCost());
        System.out.println("-----------------------------------");
        Meal mealB = mealBuilder.SetMealB();
        System.out.println("套餐B：");
        mealA.showItems();
        System.out.println("总花费："+mealB.getCost());

    }
}
