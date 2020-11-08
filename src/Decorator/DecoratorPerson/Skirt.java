package Decorator.DecoratorPerson;

import Decorator.Person;

/**
 * @author:YiMing
 * @create:2020/11/8,19:11
 * @version:1.0
 */
public class Skirt extends PersonDecorator {

    public Skirt(Person decoratorPerson) {
        super(decoratorPerson);
    }

    @Override
    public void PersonName(){
        decoratorPerson.PersonName();
        WithSkirt(decoratorPerson);
    }

    @Override
    public void PersonSex(){
        decoratorPerson.PersonSex();
    }

    private void WithSkirt(Person decoratorPerson){
        System.out.println("穿裙子");
    }
}
