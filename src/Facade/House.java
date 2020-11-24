package Facade;

/**
 * @author:YiMing
 * @create:2020/11/24,21:36
 * @version:1.0
 * 房产
 */
public class House implements Transaction{
    @Override
    public void Buy() {
        System.out.println("买房产");
    }
}
