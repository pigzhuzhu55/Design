package example.builder;

/*
这里其实可以再进行提取封装
 */
public class MealBuilder {

    //甜甜蜜套餐蜜
    public Meal SweetAndHappy()
    {
        Meal meal = new Meal();
        meal.addItem(new DurianPizza());
        meal.addItem(new Sprite());
        return meal;
    }

    //团团圆圆餐蜜
    public Meal Reunion()
    {
        Meal meal = new Meal();
        meal.addItem(new DurianPizza());
        meal.addItem(new BeefPizza());
        meal.addItem(new FruitsPizza());
        meal.addItem(new Sprite());
        meal.addItem(new Sprite());
        meal.addItem(new Fanta());
        return meal;
    }

    /*
    暖心套餐
     */
    public Meal WarmHeart(){
        Meal meal = new Meal();
        meal.addItem(new FruitsPizza());
        meal.addItem(new Water());
        return meal;
    }
}
