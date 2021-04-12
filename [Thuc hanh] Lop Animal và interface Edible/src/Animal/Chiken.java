package Animal;

import Edible.Edible;

public class Chiken extends Animal implements Edible {
    @Override
    public String makingSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Should be fried";
    }
}

