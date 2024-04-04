package main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.animals;

public class DogAnimal extends Animal {
    public DogAnimal() {
        super("Fido", "woof!");
    }

    public DogAnimal(String dogName) {
        super(dogName, "woof!");
    }

    @Override
    public String getSound() {
        return "BARK BARK!";
    }

    public void bark() {
        System.out.println("Bark!");
    }
}
