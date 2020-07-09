package seven;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Pitbull(2019));
        animals.add(new LargeEaredPiedBat(2015));
        animals.add(new AfricanElephant(2010));
        animals.add(new SiameseCat(2011));
        Animal a = new Pitbull(2020);
        System.out.println(animals);
        for(Animal animal: animals)
        {
            animal.move();
            animal.speak();
        }
    }
}