package www.experis.animalKingdom.animals;

import www.experis.animalKingdom.abstractClasses.Animal;
import www.experis.animalKingdom.intreface.IsCarnivorous;

public class Dog extends Animal implements IsCarnivorous {
    @Override
    public void verse() {
        System.out.println("Bau Bau");
    }
    @Override
    public void eatMeat() {
        System.out.println("Eat meat");
    }
}
