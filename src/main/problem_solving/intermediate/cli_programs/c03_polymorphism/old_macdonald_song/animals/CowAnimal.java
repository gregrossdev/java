package main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.animals;

public class CowAnimal extends Animal {
    public CowAnimal() {
        super("Cow", "moo!");
    }

    public CowAnimal(String cowName) {
        super(cowName, "moo!");
    }
}
