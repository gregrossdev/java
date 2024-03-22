package main.problem_solving.basics.cli_programs;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    // guess a random number between 0 and 10;
    // get random number
    static int getRandomNumber(int minNumber, int maxNumber) {
        Random  r = new Random();
        return r.nextInt((maxNumber - minNumber) + 1) + minNumber;
    }

    // let user define range and then guess the number
    public static void main(String[] args) {
        // initialize scanner for cli
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a range of numbers to guess from");

        // user enters minimum number
        System.out.print("Enter the minimum number in the range: ");
        String minNumberString = scanner.nextLine();

        // system stores minimum number
        int minNumber = Integer.parseInt(minNumberString);
        // system stores maximum number
        int maxNumber;
        // loop over until maximum number is greater than minNumber
        do {
            // enter max number
            System.out.print("Enter the maximum number in the range: ");
            String maxNumberString = scanner.nextLine();
            maxNumber = Integer.parseInt(maxNumberString);
            // validate max is greater than min
            if(maxNumber <= minNumber) System.out.println("Enter a number larger than the minimum number for the range");
        } while (minNumber >= maxNumber);

        // store random number
        int randomNumber = getRandomNumber(minNumber, maxNumber);

        // store guessed number
        int guessedNumber;

        // loop over until number is guessed
        do {
            // user guesses number
            System.out.println("Guess a number between the range of " + minNumber + "-" + maxNumber + ": ");
            String guessedNumberString = scanner.nextLine();

            // update guessed number
           guessedNumber = Integer.parseInt(guessedNumberString);
            if (guessedNumber < minNumber || guessedNumber > maxNumber) {
                System.out.println("Invalid guess.");
            }
            if (guessedNumber < randomNumber) System.out.println("Guess higher");
            else if (guessedNumber > randomNumber) System.out.println("Guess lower");
            else System.out.println("Correct!!!");
        } while (guessedNumber != randomNumber);
    }

}
