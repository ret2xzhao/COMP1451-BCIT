package eight;

public abstract class Bat extends Mammal implements Flyable, Speakable {
    @Override
    public void fly() {
        System.out.println("flap hands and fingers");
    }

    @Override
    public void land() {
        System.out.println("acrobatic maneuver that puts them head down and feet up");
    }

    @Override
    public void speak(int numTimes) {
        for(int i=0; i<numTimes; i++){
            System.out.println("ee eee eee");
        }
    }
}