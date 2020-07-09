package seven;

public abstract class Animal
{
    private int yearBorn;

    public Animal(int yearBorn)
    {
        this.yearBorn = yearBorn;
    }

    public int getYearBorn()
    {
        return yearBorn;
    }

    public abstract void move();
    public abstract void speak();
}