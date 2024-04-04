package main.problem_solving.intermediate.exercises.e04_abstraction;

public class Unicycle extends Vehicle {
    public Unicycle() {
        super(1);
    }

    @Override
    public void accelerate() {
        System.out.println("Pedal fast and balance!");
    }
}
