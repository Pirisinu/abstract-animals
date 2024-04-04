package www.experis.animalKingdom;

import www.experis.animalKingdom.animals.Dog;
import www.experis.animalKingdom.animals.Dolphin;
import www.experis.animalKingdom.animals.Eagle;
import www.experis.animalKingdom.animals.Sparrow;
import www.experis.animalKingdom.intreface.CanFly;
import www.experis.animalKingdom.intreface.CanSwim;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Kingdom!!");
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();
        Sparrow sparrow = new Sparrow();
        dog.sleep();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
    }

    public static void letItFly(CanFly animal){
        animal.fly();
    }
    public static void letItSwim(CanSwim animal){
        animal.swim();
    }
}
