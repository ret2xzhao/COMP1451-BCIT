package three;

import java.util.HashMap;
import java.util.Set;

class CarLot
{
    private HashMap<String, Car> cars;

    CarLot()
    {
        cars = new HashMap<>();

        Car c1 = new Car("chevrolet", "corvette");
        Car c2 = new Car("volkswagen", "beetle");
        Car c3 = new Car("dodge", "charger");
        Car c4 = new Car("lamborghini", "aventador");

        cars.put(c1.getModel(), c1);
        cars.put(c2.getModel(), c2);
        cars.put(c3.getModel(), c3);
        cars.put(c4.getModel(), c4);
    }

    public boolean lotContainsModel(String model)
    {
        return cars.containsKey(model);
    }

    public Car getCarForModel(String model)
    {
        return cars.get(model);
    }

    public void printAllCarMakesAndModels()
    {
        // get a set of keys and for each through them
        Set<String> models = cars.keySet();

        for(String model: models)
        {
            System.out.println(model + " was made by " + cars.get(model).getMake());
        }
    }
}