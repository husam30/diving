package nl.capgemini.diving;

import nl.capgemini.diving.equelstrainer.Suit;
import nl.capgemini.diving.instansoftranier.Animal;
import nl.capgemini.diving.instansoftranier.Cat;
import nl.capgemini.diving.instansoftranier.Dog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void foo(List<Animal> animals){

        for (Animal a : animals){
            if (a instanceof Dog){
                Dog d = (Dog) a ;
                d.bark();
            }else if (a instanceof Cat){
                Cat c = (Cat) a ;
                c.miau();
            }else a.eat();
        }

    }

    public static void main(String[] args) {
       /* System.out.println("Main Work!");

        Animal d1 = new Dog();
        Animal c1 = new Cat();

        List<Animal> animals = new ArrayList<>();
        animals.add(d1);
        animals.add(c1);
        animals.add(new Animal());
        foo(animals);*/

        Set<Suit> suits = new HashSet<>();

        Suit first = new Suit();
        first.color = "Black";
        first.size = "xl";

        suits.add(first);

        System.out.println(first);

        if (suits.size() != 1){
            throw new AssertionError();
        }

        Suit second = new Suit();
        second.color = "Black";
        second.size = "xl";

        suits.add(second);
        System.out.println(second);
        if (suits.size() !=1){
            throw new AssertionError();
        }
    }
}
