package Facade;

/**
 * @author:YiMing
 * @create:2020/11/24,21:37
 * @version:1.0
 * 外观类（符合依赖倒置+迪米特原则）
 * 适用于：
 * 1. 用于设计初期分层
 * 2. 开发阶段，减少依赖
 * 3. 给新系统开发针对难维护的旧系统的接口外观
 */
public class Facade {
    private House house;
    private NationalDebtl nationalDebtl;
    private StockA stockA;
    private StockB stockB;

    public Facade(){
        house = new House();
        nationalDebtl = new NationalDebtl();
        stockA = new StockA();
        stockB = new StockB();
    }

    public void MethodA(){
        house.Buy();
        nationalDebtl.Buy();
        stockB.Buy();
    }

    public void MethodB(){
        stockA.Buy();
        nationalDebtl.Buy();
    }
}
