package eight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Test t = new Test();
        HockeyTeam t = new HockeyTeam();

        List<Animal> zoo;
        zoo = new ArrayList<>();
        zoo.add(new FlyingFox());
        zoo.add(new Dog());
        zoo.add(new Ladybug());

        for(Animal animal: zoo) {
            if(animal instanceof Flyable) {
                ((Flyable) animal).fly();
                ((Flyable) animal).land();
                ((Flyable) animal).concrete();
            }
            if(animal instanceof Speakable) {
                ((Speakable) animal).speak(5);
            }
        }
    }
}