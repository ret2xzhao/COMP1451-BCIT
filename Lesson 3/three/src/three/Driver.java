package three;

public class Driver
{
    public static void main(String[] args)
    {
        CarLot c = new CarLot();

        System.out.println(c.lotContainsModel("charger"));
        System.out.println(c.lotContainsModel("zysdfas"));

        c.printAllCarMakesAndModels();
    }
}