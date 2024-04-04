package main.problem_solving.intermediate.exercises.e04_abstraction.cars;
import main.problem_solving.intermediate.exercises.e04_abstraction.Vehicle;

public abstract class Car extends Vehicle {

    public Car(int wheelCount) {
        super(wheelCount);
    }

    @Override
    public void accelerate() {
        System.out.println("Pedal to metal!");
    }

    public abstract String getFuelType();

}
