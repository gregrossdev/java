package main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.animals;

public class ChickenAnimal extends Animal {
    public ChickenAnimal() {
        super("Chicken", "cluck!");
    }

    public ChickenAnimal(String name) {
        super(name, "cluck!");
    }

    public ChickenAnimal(String name, String sound) {
        super(name, sound);
    }


    public void layEgg() {
        System.out.println("Chicken laid an egg!");
    }
}
