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

        System.out.println("------------------");
        System.out.println("Dog");
        System.out.println();
        System.out.print("Sleep: ");
        dog.sleep();
        System.out.print("Verse: ");
        dog.verse();
        System.out.print("Eat: ");
        dog.eatMeat();
        System.out.println("------------------");
        System.out.println("Dolphin");
        System.out.println();
        System.out.print("Sleep: ");
        dolphin.sleep();
        System.out.print("Verse: ");
        dolphin.verse();
        System.out.print("Eat: ");
        dolphin.eatMeat();
        dolphin.eatVegetables();
        System.out.println("------------------");
        System.out.println("Eagle");
        System.out.println();
        System.out.print("Sleep: ");
        eagle.sleep();
        System.out.print("Verse: ");
        eagle.verse();
        System.out.print("Eat: ");
        eagle.eatMeat();
        System.out.println("------------------");
        System.out.println("Sparrow");
        System.out.println();
        System.out.print("Sleep: ");
        sparrow.sleep();
        System.out.print("Verse: ");
        sparrow.verse();
        System.out.print("Eat: ");
        sparrow.eatVegetables();
        System.out.println("------------------");
        System.out.print("Eagle ");
        letItFly(eagle);
        System.out.print("Sparrow ");
        letItFly(sparrow);
        System.out.print("Dolphin ");
        letItSwim(dolphin);
    }

    public static void letItFly(CanFly animal){
        animal.fly();
    }
    public static void letItSwim(CanSwim animal){
        animal.swim();
    }
}
