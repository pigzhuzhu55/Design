package example.builder;

/*
玛格丽塔点披萨套餐
 */
public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("团团圆圆餐蜜");
        Meal meal1 = mealBuilder.Reunion();
        meal1.showItems();
        System.out.println("--------------");

        System.out.println("甜甜蜜蜜套餐");
        Meal meal2 = mealBuilder.SweetAndHappy();
        meal2.showItems();
        System.out.println("--------------");

        System.out.println("暖心套餐");
        Meal meal3 = mealBuilder.WarmHeart();
        meal3.showItems();
        System.out.println("--------------");
    }
}
