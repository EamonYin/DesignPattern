package Facade;

/**
 * @author:YiMing
 * @create:2020/11/24,21:33
 * @version:1.0
 * 股票B
 */
public class StockB implements Transaction{
    @Override
    public void Buy() {
        System.out.println("买股票B");
    }
}
