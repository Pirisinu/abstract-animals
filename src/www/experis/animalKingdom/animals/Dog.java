package www.experis.animalKingdom.animals;

import www.experis.animalKingdom.abstractClasses.Animals;
import www.experis.animalKingdom.intreface.IsCarnivorous;
import www.experis.animalKingdom.intreface.IsOmnivorous;

public class Dog extends Animals implements IsCarnivorous {
    @Override
    protected void verse() {
        System.out.println("Bau Bau");
    }
    @Override
    public void eatMeat() {
        System.out.println("Eat meat");
    }
}
