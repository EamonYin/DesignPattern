package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/11/26,20:27
 * @version:1.0
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    //点餐
    public void addMeal(Item item){
        items.add(item);
    }
    //合计
    public double getCost(){
        double cost = 0;
        for (Item item: items) {
            cost += item.price();
        }
        return cost;
    }
    //显示账单
    public void showItems(){
        for (Item item: items) {
            System.out.print("点餐："+item.name()+" ");
            System.out.print("包装："+item.packing().pack()+" ");
            System.out.print("花费："+item.price());
            System.out.println();
        }

    }
}
