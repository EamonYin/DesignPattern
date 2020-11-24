package Facade;

/**
 * @author:YiMing
 * @create:2020/11/24,21:31
 * @version:1.0
 * 股票A
 */
public class StockA implements Transaction{
    @Override
    public void Buy() {
        System.out.println("买股票A");
    }
}
