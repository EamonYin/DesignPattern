package Decorator;

import Decorator.DecoratorPerson.Skirt;
import Decorator.DecoratorPerson.Tshirt;

/**
 * @author:YiMing
 * @create:2020/11/8,19:16
 * @version:1.0
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Hong hong = new Hong();
        hong.PersonName();
        hong.PersonSex();
        System.out.println("-------------------------");
        Skirt skirt = new Skirt(new Hong());
        skirt.PersonName();
        skirt.PersonSex();
        System.out.println("-------------------------");
        Tshirt tshirt = new Tshirt(new Hong());
        tshirt.PersonName();
        tshirt.PersonSex();
    }
}
