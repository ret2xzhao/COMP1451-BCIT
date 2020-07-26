import java.util.ArrayList;
import java.util.Collections;

/**
 * class Main
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Main {
    private static ArrayList<Car>      cars      = new ArrayList<Car>();
    private static ArrayList<Boat>     boats     = new ArrayList<Boat>();
    private static ArrayList<Airplane> airplanes = new ArrayList<Airplane>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        cars.add(new Car(2000, "Lamborghini", "Diablo" , 700));
        cars.add(new Car(1997, "Dodge"      , "Ram"    , 175));
        cars.add(new Car(1940, "Buggati"    , "Veyron" , 135));
        cars.add(new Car(2014, "Honda"      , "Civic"  , 143));
        cars.add(new Car(2011, "Honda"      , "Civic"  , 143));
        cars.add(new Car(1999, "Toyota"     , "Corrola", 140));
        boats.add(new Boat(1980, "Bayliner"      , "Extreme"      , true));
        boats.add(new Boat(2014, "Bayliner"      , "Extreme II"   , true));
        boats.add(new Boat(2000, "American Skier", "Skier Supreme", false));
        boats.add(new Boat(2010, "Boesch"        , "Journey"      , false));
        airplanes.add(new Airplane(1998, "ABC Motors", "Comac"    , 10000));
        airplanes.add(new Airplane(1940, "Boeing"    , "84"       , 45000));
        airplanes.add(new Airplane(2012, "Boeing"    , "737"      , 80000));
        airplanes.add(new Airplane(2014, "Abrams"    , "Motorhead", 70000));

        Main main = new Main();
        main.displayCars();
        System.out.println();
        main.displayBoats();
        System.out.println();
        main.displayAirplanes();
    }

    /**
     * Prints cars before and after sorting them.
     */
    public void displayCars() {
        if(cars != null) {
            for(Car c: cars) {
                System.out.println(c.toString());
            }
            Collections.sort(cars);
            System.out.println();
            for(Car c: cars) {
                System.out.println(c.toString());
            }
        }
    }

    /**
     * Prints boats before and after sorting them.
     */
    public void displayBoats() {
        if(boats != null) {
            for(Boat b: boats) {
                System.out.println(b.toString());
            }
            Collections.sort(boats);
            System.out.println();
            for(Boat b: boats) {
                System.out.println(b.toString());
            } 
        }
    }

    /**
     * Prints airplanes before and after sorting them.
     */
    public void displayAirplanes() {
        if(airplanes != null) {
            for(Airplane a: airplanes) {
                System.out.println(a.toString());
            }
            Collections.sort(airplanes);
            System.out.println();
            for(Airplane a: airplanes) {
                System.out.println(a.toString());
            } 
        }
    }
}