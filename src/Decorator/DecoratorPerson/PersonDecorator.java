package Decorator.DecoratorPerson;

import Decorator.Person;

/**
 * @author:YiMing
 * @create:2020/11/8,19:07
 * @version:1.0
 */
public abstract class PersonDecorator implements Person {
    protected Person decoratorPerson;

    public PersonDecorator(Person decoratorPerson) {
        this.decoratorPerson = decoratorPerson;
    }

    public void PersonName() {
        decoratorPerson.PersonName();
    }

    public void PersonSex() {
        decoratorPerson.PersonSex();
    }
}
