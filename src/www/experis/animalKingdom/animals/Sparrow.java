package www.experis.animalKingdom.animals;

import www.experis.animalKingdom.abstractClasses.Animal;
import www.experis.animalKingdom.intreface.CanFly;
import www.experis.animalKingdom.intreface.IsHerbivorous;

public class Sparrow extends Animal implements IsHerbivorous , CanFly {
    @Override
    protected void verse() {
        System.out.println("Cip Cip");
    }
    @Override
    public void eatVegetables() {
        System.out.println("Eat vegetables.");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
