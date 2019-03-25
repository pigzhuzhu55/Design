package example.composite;

/*
所谓组合模式，其实说的是对象包含对象的问题，通过组合的方式（在对象内部引用对象）来进行布局
 */
public class Main {
    public static void main(String[] args){
        Area province = new Province("福建省");
        Area city1 = new City("福州市");
        Area city2 = new City("厦门市");


        Area county11 = new County("鼓楼区");
        Area county12 = new County("台江区");
        Area county13 = new County("仓山区");

        Area county21 = new County("湖里区");
        Area county22 = new County("集美区");

        province.add(city1);
        province.add(city2);

        city1.add(county11);
        city1.add(county12);
        city1.add(county13);

        city2.add(county21);
        city2.add(county22);

        province.display();

    }
}
