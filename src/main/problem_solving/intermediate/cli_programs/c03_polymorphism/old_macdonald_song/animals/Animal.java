package main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.animals;

import main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.singing.Singable;

public class Animal implements Singable {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String sing() {
        return null;
    }

}