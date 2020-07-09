package seven;

public abstract class Dog extends Mammal
{
    public Dog(int yearBorn)
    {
        super(yearBorn);
    }

    @Override
    public void move()
    {
        System.out.println("run");
    }

    @Override
    public void speak()
    {
        System.out.println("bark");
    }
}