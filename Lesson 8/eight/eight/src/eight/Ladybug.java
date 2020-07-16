package eight;

public class Ladybug extends FlyingInsect {
    @Override
    public void fly() {
        System.out.println("flutter their wings");
    }

    @Override
    public void land() {
        System.out.println("land on flowers");
    }
}