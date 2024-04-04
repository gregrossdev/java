package main.problem_solving.intermediate.exercises.e04_abstraction;

public abstract class Vehicle {
    private final int wheelCount;

    public Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public abstract void accelerate();

    public int getWheelCount() {
        return wheelCount;
    }
}
