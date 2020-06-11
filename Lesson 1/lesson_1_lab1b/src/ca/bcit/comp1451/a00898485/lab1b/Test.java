package ca.bcit.comp1451.a00898485.lab1b;

public class Test
{

    public static void main(String[] args)
    {
        if(args.length == 4)
        {
            Person p = new Person(args[0], args[1], Integer.parseInt(args[2]));
            p.x = Double.parseDouble(args[3]);
            System.out.println("First Name: " + p.getFirstName());
            System.out.println("Last Name: " + p.getLastName());
            System.out.println("Year Of Birth: " + p.getYearOfBirth());
            System.out.println("Value Of x: " + p.x);
        }
        else
        {
            System.out.println("Wrong number of arguments");
        }
    }
}