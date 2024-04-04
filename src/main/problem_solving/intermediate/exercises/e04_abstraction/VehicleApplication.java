package main.problem_solving.intermediate.exercises.e04_abstraction;

import main.problem_solving.intermediate.exercises.e04_abstraction.cars.ElectricCar;

public class VehicleApplication {
    public static void main(String[] args) {

        Vehicle vehicle = new Unicycle();

        Vehicle electricCar = new ElectricCar(4);
    }
}
