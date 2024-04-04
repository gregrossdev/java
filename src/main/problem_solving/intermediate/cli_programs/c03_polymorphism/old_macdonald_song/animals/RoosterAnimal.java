package main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.animals;

import main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.singing.Singable;

public class RoosterAnimal extends ChickenAnimal implements Singable {

    public RoosterAnimal() {
        super("Chanteclaire", "cockadoodledoo!");
    }

    public RoosterAnimal(String roosterName) {
        super(roosterName, "cockadoodledoo!");
    }
}
