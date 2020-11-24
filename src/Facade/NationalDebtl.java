package Facade;

/**
 * @author:YiMing
 * @create:2020/11/24,21:35
 * @version:1.0
 * 国债
 */
public class NationalDebtl implements Transaction{
    @Override
    public void Buy() {
        System.out.println("买国债");
    }
}
