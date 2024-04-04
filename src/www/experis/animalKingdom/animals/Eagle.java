package www.experis.animalKingdom.animals;

import www.experis.animalKingdom.abstractClasses.Animal;
import www.experis.animalKingdom.intreface.CanFly;
import www.experis.animalKingdom.intreface.IsCarnivorous;

public class Eagle extends Animal implements IsCarnivorous, CanFly {
    @Override
    protected void verse() {
        System.out.println("Verso dell'aquila.");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eat meat.");
    }
}
