
package Project;

import java.util.Scanner;

public class Guesser {

    public static void main(String[] args) {
        new Guesser();
    } // end main

    public Guesser() {
        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);

        while (keepPlaying) {
            String response = menu(scanner);

            if (response.equals("0")) {
                System.out.println("Exiting...");
                break;
            } else if (response.equals("1")) {
                // Human Guesser logic
                System.out.println("\nHuman Guesser selected.");

                int correctNumber = (int) (Math.random() * 100) + 1;

                int guessCount = 0;
                int number = 0;

                while (number != correctNumber) {

                    System.out.println("Please enter a number: "
                            + guessCount + " guesses so far.");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Please enter a valid integer.");
                        scanner.nextLine();
                        continue;
                    }

                    number = scanner.nextInt();
                    scanner.nextLine();

                    if (number < 1 || number > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                        continue;
                    }
                    guessCount++;

                    if (number < correctNumber) {
                        System.out.println("Too low!");
                    } else if (number > correctNumber) {
                        System.out.println("Too high!");
                    }
                }
                System.out.println("Congratulations! You guessed it right in " + guessCount + " guesses.");

            } else if (response.equals("2")) {
                // Computer Guesser logic
                System.out.println("\nComputer Guesser selected.");
                System.out.println("Please enter the number for the computer to guess:");
                int correctNumber;
                while (true) {
                        correctNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (correctNumber >= 1 && correctNumber <= 100) {
                            break;
                        } else { 
                        scanner.nextLine();
                    }
                  System.out.println("Please enter an integer between 1 and 100:");
                }
                int low = 1;
                int high = 100;
                int guessCount = 0;
                while (low <= high) {
                    int computerGuess = (low + high) / 2;
                    guessCount++;
                    System.out.println("\nComputer guessed " + computerGuess + ".");
                    if (computerGuess == correctNumber) {
                        System.out.println("Computer guessed it right in " + guessCount + " guesses!");
                        break;
                    }
                    String feedback;
                    while (true) {
                        System.out.println("Too (H)igh or (L)ow?");
                        feedback = scanner.nextLine();

                        if (feedback.equals("H") || feedback.equals("L")) {
                            break;
                        }

                        System.out.println("Invalid input. Enter H or L.");
                    }
                    if (feedback.equals("H")) {
                        high = computerGuess - 1;
                    } else {
                        low = computerGuess + 1;
                    }
                }
                if (low > high) {
                    System.out.println("Bad feedback, don't lie!");
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    } // end Guesser constructor

    private String menu(Scanner scanner) {
        System.out.println("\n0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");

        return scanner.nextLine();
    } // end menu method

} // end Guesser class
