package main.problem_solving.intermediate.exercises.e04_abstraction.cars;

public class ElectricCar extends Car {

    public ElectricCar(int wheelCount) {
        super(wheelCount);
    }

    @Override
    public String getFuelType() {
        return "Electric!";
    }
}
