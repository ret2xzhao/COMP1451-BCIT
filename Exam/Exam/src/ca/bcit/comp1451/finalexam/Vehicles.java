package ca.bcit.comp1451.finalexam;

import java.util.ArrayList;
import java.util.Collections;

public class Vehicles {
    private ArrayList<Vehicle> vehicles;

    public Vehicles(){
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car(1000));
        vehicles.add(new Boat(1200));
        vehicles.add(new Car(800));
        vehicles.add(new Boat(900));
        displayVehicles();
    }

    public void displayVehicles() {
        if(vehicles != null) {
            for(Vehicle v: vehicles) {
                System.out.println(v.toString());
            }
            Collections.sort(vehicles);
            System.out.println();
            for(Vehicle v: vehicles) {
                System.out.println(v.toString());
            }
        }
    }
}