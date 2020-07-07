package six;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Mammal());
        animals.add(new Bat());
        animals.add(new Dolphin());
        animals.add(new BottlenoseDolphin());
        animals.add(new Chihuahua("C"));
        animals.add(new Dog());
        animals.add(new FruitBat());

        for(Animal a: animals)
        {
            a.move();
            a.speak();
            System.out.println(a);
            System.out.println();
            if(a instanceof Bat)
            {
                Bat b = (Bat)a;
                b.echolocate();
                System.out.println();
            }
        }
    }
}