package six;

public class Dolphin extends Mammal
{
    @Override
    public void move()
    {
        System.out.println("swimming");
    }

    @Override
    public void speak()
    {
        System.out.println("ee ee ee");
    }
}