package Decorator.DecoratorPerson;

import Decorator.Person;

/**
 * @author:YiMing
 * @create:2020/11/8,19:11
 * @version:1.0
 */
public class Tshirt extends PersonDecorator {

    public Tshirt(Person decoratorPerson) {
        super(decoratorPerson);
    }

    @Override
    public void PersonName(){
        decoratorPerson.PersonName();
        WithTshirt(decoratorPerson);
    }

    @Override
    public void PersonSex(){
        decoratorPerson.PersonSex();

    }

    private void WithTshirt(Person decoratorPerson){
        System.out.println("穿T恤");
    }
}
