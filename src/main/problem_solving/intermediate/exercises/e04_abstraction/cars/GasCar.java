package main.problem_solving.intermediate.exercises.e04_abstraction.cars;

public class GasCar extends Car{

    public GasCar(int wheelCount) {
        super(wheelCount);
    }

    @Override
    public String getFuelType() {
        return "Gas";
    }
}
