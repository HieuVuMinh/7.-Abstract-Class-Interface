import Animal.Animal;
import Animal.Tiger;
import Animal.Chiken;
import Fruit.Fruit;
import Fruit.Orange;
import Fruit.Apple;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();
        for (Animal animal : animals){
            System.out.println(animal.makingSound());

            if (animal instanceof Chiken){
                System.out.println(((Chiken) animal).howToEat());
            }
        }

        System.out.println("------------------------------------");

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
