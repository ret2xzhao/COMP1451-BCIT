package eight;

public class Test implements Flyable, Comparable {
    public Test() {
        //Flyable.e = 700;
    }

    @Override
    public void fly() {
    }

    @Override
    public void land() {
    }

    @Override
    public int compareTo(Object o) {
        return 5;
    }
}