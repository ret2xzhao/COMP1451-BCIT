package seven;

public abstract class Bat extends Mammal
{
    public Bat(int yearBorn)
    {
        super(yearBorn);
    }

    @Override
    public void move()
    {
        System.out.println("fly");
    }

    @Override
    public void speak()
    {
        System.out.println("squeal");
    }
}