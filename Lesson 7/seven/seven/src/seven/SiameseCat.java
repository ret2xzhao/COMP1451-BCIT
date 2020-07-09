package seven;

public class SiameseCat extends Cat
{
    public SiameseCat(int yearBorn)
    {
        super(yearBorn);
    }

    @Override
    public void move()
    {
        System.out.println("swat");
    }

    @Override
    public void speak()
    {
        System.out.println("hiss");
    }
}