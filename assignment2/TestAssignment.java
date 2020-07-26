import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * class TestAssignment
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class TestAssignment {

    @Before
    public void setUp() {
        System.out.println("setting up");
    }

    @After
    public void tearDown() {
        System.out.println("tearing down");
    }

    @Test
    public void testVehicleGetYearManufactured1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        assertEquals(2014, c.getYearManufactured());
    }

    @Test
    public void testVehicleGetYearManufactured2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setYearManufactured(2020);
        assertEquals(2020, c.getYearManufactured());
    }

    @Test
    public void testVehicleSetYearManufactured1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setYearManufactured(0);
        assertEquals(0, c.getYearManufactured());
    }

    @Test
    public void testVehicleSetYearManufactured2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        try {
            c.setYearManufactured(-45);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::yearManufactured.", e.getMessage());
        }
    }

    @Test
    public void testVehicleGetMake1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        assertEquals("Honda", c.getMake());
    }

    @Test
    public void testVehicleGetMake2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setMake("Toyota");
        assertEquals("Toyota", c.getMake());
    }

    @Test
    public void testVehicleSetMake1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setMake("GM");
        assertEquals("GM", c.getMake());
    }

    @Test
    public void testVehicleSetMake2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        try {
            c.setMake(null);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::make.", e.getMessage());
        }
    }

    @Test
    public void testVehicleSetMake3() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        try {
            c.setMake("     ");
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::make.", e.getMessage());
        }
    }

    @Test
    public void testVehicleGetModel1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        assertEquals("Civic", c.getModel());
    }

    @Test
    public void testVehicleGetModel2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setModel("Accord");
        assertEquals("Accord", c.getModel());
    }

    @Test
    public void testVehicleSetModel1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setModel("CR-V");
        assertEquals("CR-V", c.getModel());
    }

    @Test
    public void testVehicleSetModel2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        try {
            c.setModel(null);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::model.", e.getMessage());
        }
    }

    @Test
    public void testVehicleSetModel3() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        try {
            c.setModel("   ");
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::model.", e.getMessage());
        }
    }

    @Test
    public void testCarGetHorsepower1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        assertEquals(143, c.getHorsepower());
    }

    @Test
    public void testCarGetHorsepower2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setHorsepower(190);
        assertEquals(190, c.getHorsepower());
    }

    @Test
    public void testCarSetHorsepower1() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        c.setHorsepower(0);
        assertEquals(0, c.getHorsepower());
    }

    @Test
    public void testCarSetHorsepower2() {
        Car c = new Car(2014, "Honda", "Civic", 143);
        try {
            c.setHorsepower(-1);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Car::horsepower.", e.getMessage());
        }
    }

    @Test
    public void testCarEquals1() {
        Car c1 = new Car(2011, "Honda", "Civic", 143);
        Car c2 = new Car(2014, "Honda", "Civic", 143);
        Car c3 = new Car(1940, "Buggati", "Veyron", 135);
        assertEquals(true, c1.equals(c2));
        assertEquals(true, c1.equals(c3));
        assertEquals(true, c2.equals(c3));
    }

    @Test
    public void testCarEquals2() {
        Car c1 = new Car(2011, "Honda", "Civic", 143);
        Car c2 = new Car(1940, "Buggati", "Veyron", 135);
        Car c3 = new Car(2000, "Lamborghini", "Diablo", 700);
        assertEquals(false, c2.equals(c3));
        c1.setHorsepower(710);
        assertEquals(true, c1.equals(c3));
    }

    @Test
    public void testCarToString1() {
        Car c = new Car(2011, "Honda", "Civic", 143);
        assertEquals("This car is a 2011 Honda Civic with 143 hp.", c.toString());
    }

    @Test
    public void testCarToString2() {
        Car c = new Car(2011, "Honda", "Civic", 143);
        c = new Car(2000, "Lamborghini", "Diablo", 700);
        assertEquals("This car is a 2000 Lamborghini Diablo with 700 hp.", c.toString());
    }

    @Test
    public void testCarCompareTo1() {
        Car c1 = new Car(2011, "Honda", "Civic", 143);
        Car c2 = new Car(2014, "Honda", "Civic", 143);
        Car c3 = new Car(1940, "Buggati", "Veyron", 135);
        int result = c1.compareTo(c3);
        assertEquals(true, (result > 0));
        assertEquals(8, result);
        result = c1.compareTo(c2);
        assertEquals(true, (result == 0));
    }

    @Test
    public void testCarCompareTo2() {
        Car c1 = new Car(1940, "Buggati", "Veyron", 135);
        Car c2 = new Car(2000, "Lamborghini", "Diablo", 700);
        int result = c1.compareTo(c2);
        assertEquals(true, (result < 0));
        assertEquals(-565, result);
    }

    @Test
    public void testCarConstructor1() {
        Car c = new Car(2000, "Lamborghini", "Diablo", 700);
        assertEquals(2000, c.getYearManufactured());
        assertEquals("Lamborghini", c.getMake());
        assertEquals("Diablo", c.getModel());
        assertEquals(700, c.getHorsepower());
    }

    @Test
    public void testCarConstructor2() {
        try {
            Car c = new Car(-1, "Lamborghini", "Diablo", 700);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::yearManufactured.", e.getMessage());
        }
        try {
            Car c = new Car(2000, null, "Diablo", 700);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::make.", e.getMessage());
        }
        try {
            Car c = new Car(2000, "Lamborghini", null, 700);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::model.", e.getMessage());
        }
        try {
            Car c = new Car(2000, "Lamborghini", "Diablo", -1);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Car::horsepower.", e.getMessage());
        }
    }

    @Test
    public void testBoatGetMotorized1() {
        Boat b = new Boat(1980, "Bayliner", "Extreme", true);
        assertEquals(true, b.getMotorized());
    }

    @Test
    public void testBoatGetMotorized2() {
        Boat b = new Boat(1980, "Bayliner", "Extreme", true);
        b = new Boat(2000, "American Skier", "Skier Supreme", false);
        assertEquals(false, b.getMotorized());
    }

    @Test
    public void testBoatSetMotorized1() {
        Boat b = new Boat(1980, "Bayliner", "Extreme", true);
        b.setMotorized(false);
        assertEquals(false, b.getMotorized());
    }

    @Test
    public void testBoatSetMotorized2() {
        Boat b = new Boat(1980, "Bayliner", "Extreme", true);
        b = new Boat(2000, "American Skier", "Skier Supreme", false);
        b.setMotorized(true);
        assertEquals(true, b.getMotorized());
    }

    @Test
    public void testBoatEquals1() {
        Boat b1 = new Boat(1980, "Bayliner", "Extreme", true);
        Boat b2 = new Boat(2014, "Bayliner", "Extreme II", true);
        Boat b3 = new Boat(2000, "American Skier", "Skier Supreme", false);
        Boat b4 = new Boat(2010, "Boesch", "Journey", false);
        assertEquals(true, b1.equals(b2));
        assertEquals(true, b3.equals(b4));
    }

    @Test
    public void testBoatEquals2() {
        Boat b1 = new Boat(1980, "Bayliner", "Extreme", true);
        Boat b2 = new Boat(2014, "Bayliner", "Extreme II", true);
        Boat b3 = new Boat(2000, "American Skier", "Skier Supreme", false);
        Boat b4 = new Boat(2010, "Boesch", "Journey", false);
        assertEquals(false, b1.equals(b3));
        assertEquals(false, b2.equals(b4));
        b1.setMotorized(false);
        assertEquals(true, b1.equals(b3));
    }

    @Test
    public void testBoatToString1() {
        Boat b = new Boat(1980, "Bayliner", "Extreme", true);
        assertEquals("This boat is a 1980 Bayliner Extreme (with motor).", b.toString());
    }

    @Test
    public void testBoatToString2() {
        Boat b = new Boat(2000, "American Skier", "Skier Supreme", false);
        assertEquals("This boat is a 2000 American Skier Skier Supreme (without motor).", b.toString());
    }

    @Test
    public void testBoatCompareTo1() {
        Boat b1 = new Boat(1980, "Bayliner", "Extreme", true);
        Boat b2 = new Boat(2000, "American Skier", "Skier Supreme", false);
        int result = b1.compareTo(b2);
        assertEquals(true, (result < 0));
        assertEquals(-20, result);
        b1.setYearManufactured(2000);
        result = b1.compareTo(b2);
        assertEquals(true, (result == 0));
    }

    @Test
    public void testBoatCompareTo2() {
        Boat b1 = new Boat(2014, "Bayliner", "Extreme II", true);
        Boat b2 = new Boat(2000, "American Skier", "Skier Supreme", false);
        Boat b3 = new Boat(2010, "Boesch", "Journey", false);
        int result = b1.compareTo(b2);
        assertEquals(true, (result > 0));
        assertEquals(14, result);
        result = b1.compareTo(b3);
        assertEquals(4, result);
    }

    @Test
    public void testBoatConstructor1() {
        Boat b = new Boat(2014, "Bayliner", "Extreme II", true);
        assertEquals(2014, b.getYearManufactured());
        assertEquals("Bayliner", b.getMake());
        assertEquals("Extreme II", b.getModel());
        assertEquals(true, b.getMotorized());
    }

    @Test
    public void testBoatConstructor2() {
        try {
            Boat b = new Boat(-1, "Bayliner", "Extreme II", true);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::yearManufactured.", e.getMessage());
        }
        try {
            Boat b = new Boat(2014, "", "Extreme II", true);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::make.", e.getMessage());
        }
        try {
            Boat b = new Boat(2014, "Bayliner", "", true);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::model.", e.getMessage());
        }
    }

    @Test
    public void testAirplaneGetMaximumHeightFeet1() {
        Airplane a = new Airplane(1998, "ABC Motors", "Comac", 10000);
        assertEquals(10000, a.getMaximumHeightFeet());
    }

    @Test
    public void testAirplaneGetMaximumHeightFeet2() {
        Airplane a = new Airplane(1998, "ABC Motors", "Comac", 10000);
        a = new Airplane(1940, "Boeing", "84", 45000);
        assertEquals(45000, a.getMaximumHeightFeet());
    }

    @Test
    public void testAirplaneSetMaximumHeightFeet1() {
        Airplane a = new Airplane(1998, "ABC Motors", "Comac", 10000);
        a.setMaximumHeightFeet(0);
        assertEquals(0, a.getMaximumHeightFeet());
    }

    @Test
    public void testAirplaneSetMaximumHeightFeet2() {
        Airplane a = new Airplane(1998, "ABC Motors", "Comac", 10000);
        try {
            a.setMaximumHeightFeet(-1);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Airplane::maximumHeightFeet.", e.getMessage());
        }
    }

    @Test
    public void testAirplaneEquals1() {
        Airplane a1 = new Airplane(1998, "ABC Motors", "Comac"    , 10000);
        Airplane a2 = new Airplane(1940, "Boeing"    , "84"       , 45000);
        Airplane a3 = new Airplane(2012, "Boeing"    , "737"      , 80000);
        Airplane a4 = new Airplane(2014, "Abrams"    , "Motorhead", 70000);
        assertEquals(false, a1.equals(a2));
        assertEquals(false, a1.equals(a3));
        assertEquals(false, a1.equals(a4));
    }

    @Test
    public void testAirplaneEquals2() {
        Airplane a1 = new Airplane(1998, "ABC Motors", "Comac"    , 10000);
        Airplane a2 = new Airplane(1940, "Boeing"    , "84"       , 45000);
        Airplane a3 = new Airplane(2012, "Boeing"    , "737"      , 80000);
        Airplane a4 = new Airplane(2014, "Abrams"    , "Motorhead", 70000);
        a2.setMaximumHeightFeet(11000);
        a3.setMaximumHeightFeet(9000);
        a4.setMaximumHeightFeet(11001);
        assertEquals(true, a1.equals(a2));
        assertEquals(true, a1.equals(a3));
        assertEquals(false, a1.equals(a4));
    }

    @Test
    public void testAirplaneToString1() {
        Airplane a = new Airplane(1998, "ABC Motors", "Comac", 10000);
        assertEquals("This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.", a.toString());
    }

    @Test
    public void testAirplaneToString2() {
        Airplane a = new Airplane(2012, "Boeing", "737", 80000);
        assertEquals("This airplane is a 2012 Boeing 737 that can reach 80000 feet.", a.toString());
    }

    @Test
    public void testAirplaneCompareTo1() {
        Airplane a1 = new Airplane(1998, "ABC Motors", "Comac", 10000);
        Airplane a2 = new Airplane(1940, "Boeing"    , "84"   , 45000);
        int result = a1.compareTo(a2);
        assertEquals(true, (result < 0));
        assertEquals(-35000, result);
        a1.setMaximumHeightFeet(45000);
        result = a1.compareTo(a2);
        assertEquals(true, (result == 0));
    }

    @Test
    public void testAirplaneCompareTo2() {
        Airplane a1 = new Airplane(1998, "ABC Motors", "Comac", 10000);
        Airplane a2 = new Airplane(1940, "Boeing"    , "84"   , 45000);
        Airplane a3 = new Airplane(2012, "Boeing"    , "737"  , 80000);
        int result = a3.compareTo(a1);
        assertEquals(true, (result > 0));
        assertEquals(70000, result);
        result = a2.compareTo(a1);
        assertEquals(35000, result);
    }

    @Test
    public void testAirplaneConstructor1() {
        Airplane a = new Airplane(2012, "Boeing", "737", 80000);
        assertEquals(2012, a.getYearManufactured());
        assertEquals("Boeing", a.getMake());
        assertEquals("737", a.getModel());
        assertEquals(80000, a.getMaximumHeightFeet());
    }

    @Test
    public void testAirplaneConstructor2() {
        try {
            Airplane a = new Airplane(-1, "Boeing", "737", 80000);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::yearManufactured.", e.getMessage());
        }
        try {
            Airplane a = new Airplane(2012, null, "737", 80000);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::make.", e.getMessage());
        }
        try {
            Airplane a = new Airplane(2012, "Boeing", "     ", 80000);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Vehicle::model.", e.getMessage());
        }
        try {
            Airplane a = new Airplane(2012, "Boeing", "737", -1);
        }
        catch(Exception e){
            assertEquals("Error: Invalid Airplane::maximumHeightFeet.", e.getMessage());
        }
    }
}