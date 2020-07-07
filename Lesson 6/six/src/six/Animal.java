package six;

public class Animal
{

    void move()
    {
        System.out.println("moving");
    }

    public void speak()
    {
        System.out.println("speaking");
    }

    @Override
    public String toString()
    {
        return super.toString() + " and my class is " + this.getClass().getSimpleName() + "!!!";
    }
}