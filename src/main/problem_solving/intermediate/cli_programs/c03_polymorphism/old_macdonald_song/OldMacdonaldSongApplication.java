package main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song;

import main.problem_solving.intermediate.cli_programs.c03_polymorphism.old_macdonald_song.animals.*;

import java.util.*;

public class OldMacdonaldSongApplication {

    private static void song(Animal animal) {
        String name = animal.getName();
        String sound = animal.getSound();
        System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
        System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
        System.out.println("With a " + sound + " " + sound + " here");
        System.out.println("And a " + sound + " " + sound + " there");
        System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
        System.out.println();
    }

    /*
     * Old Macdonald Song Lyrics
     */
    public static void singOldMacdonald(Animal animal) {
        song(animal);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name and sound of the animals
        System.out.println("Enter the name of the cow:");
        String cowName = scanner.nextLine();

        System.out.println("Enter the name of the chicken:");
        String chickenName = scanner.nextLine();

        System.out.println("Enter the name of the dog:");
        String dogName = scanner.nextLine();

        System.out.println("Enter the name of the rooster:");
        String roosterName = scanner.nextLine();

        System.out.println();
        System.out.println();

        // Create instances of objects with user input
        CowAnimal cow = new CowAnimal(cowName);
        DogAnimal dog = new DogAnimal(dogName);
        ChickenAnimal chicken = new ChickenAnimal(chickenName);
        RoosterAnimal rooster = new RoosterAnimal(roosterName);

        Animal[] farmAnimals = new Animal[] { cow, chicken, dog, rooster };

        for (Animal animal : farmAnimals)
            singOldMacdonald(animal);

    }




}
