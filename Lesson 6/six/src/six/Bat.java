package six;

public class Bat extends Mammal
{
    @Override
    public void move()
    {
        System.out.println("flying");
    }

    @Override
    public void speak()
    {
        System.out.println("chirp chirp");
    }

    public void echolocate()
    {
        System.out.println("echolocating!!!!!");
    }
}