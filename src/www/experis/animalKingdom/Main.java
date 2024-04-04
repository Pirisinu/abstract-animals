package www.experis.animalKingdom;

import www.experis.animalKingdom.intreface.CanFly;
import www.experis.animalKingdom.intreface.CanSwim;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Kingdom!!");
    }

    public static void letItFly(CanFly animal){
        animal.fly();
    }
    public static void letItSwim(CanSwim animal){
        animal.swim();
    }
}
