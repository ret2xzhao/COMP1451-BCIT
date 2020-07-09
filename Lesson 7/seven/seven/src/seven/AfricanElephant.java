package seven;

public class AfricanElephant extends Elephant
{
    public AfricanElephant(int yearBorn)
    {
        super(yearBorn);
    }

    @Override
    public void move()
    {
        System.out.println("walks in africa");
    }
}