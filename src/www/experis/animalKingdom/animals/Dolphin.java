package www.experis.animalKingdom.animals;

import www.experis.animalKingdom.abstractClasses.Animal;
import www.experis.animalKingdom.intreface.CanSwim;
import www.experis.animalKingdom.intreface.IsOmnivorous;

public class Dolphin extends Animal implements IsOmnivorous, CanSwim {
    @Override
    protected void verse() {
        System.out.println("Verso del delfino.");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public void eatAll() {
        System.out.println("Eat all");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eat meat.");
    }

    @Override
    public void eatVegetables() {
        System.out.println("Eat Vegetables.");
    }
}
