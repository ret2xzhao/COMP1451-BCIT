package seven;

public abstract class Elephant extends Mammal
{
    public Elephant(int yearBorn)
    {
        super(yearBorn);
    }

    @Override
    public void move()
    {
        System.out.println("walk");
    }

    @Override
    public void speak()
    {
        System.out.println("very low frequency");
    }
}