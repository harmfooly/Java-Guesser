# Java-Guesser
10/30/2026

## public class Guesser
```
### main: new Guesser()
```

# public Guesser()
```
bool keepPlaying = true;
Establish scanner

while (keepPlaying) {
  String response = menu(scanner)
  (if Response = "0") {
    Exit
}

  (if Response = "1") {
    HUMAN GUESSER:
      guessCount = 0;
      number = 0;
      correctNumber = Random number between 1-100
      while (number (guess) != correctNumber) {
          Scanner input for player guesses
          Print "Enter Number" + guessCount
          Increment guessCount per turn
          Check if next input is a valid integer
          Check if next int is between 1-100

          If (guess < correctNumber) {
            Print "too low"
      }  else if (guess > correctNumber) {
            Print "too high"
      }  else {
            Print "Congrats", guessCount, and then return to menu
            Stop scanner
    } // end if
  } // end while


  (if Response = "2") {
    COMPUTER GUESSER:
      guessCount = 0;
      number = 0;
      while (true) {
        correctNumber = Scanner Input (will be checked to make sure between 1-100)
        scanner checks next line
        if correctNumber is satisfactory (1-100), break loop. Else ask for int between 1-100
  } // end while loop
      int low = 1;
      int high = 100;
      int guessCount = 0;
      String feedback;
      while (low <= high) {
        computerGuess = (low + high) / 2
        increment guessCount
        Print what number the computer guessed
        if (computerGuess == correctNumber) {
            Print the computer won, and guessCount
            Break loop, return to menu
        } // end if
      } // end while

      while (true) {
          Print "Too (H)igh or (L)ow?"
          Take feedback from the user, only accept "H" or "L" as inputs
          Break loop once "H" or "L" is entered as feedback.
      } // end while loop

          If "H" is entered, high becomes computerGuess -1
          If "L" is entered, low becomes computerGuess + 1
          Catch If user makes a mistake (low > high)
          Catch invalid inputs
} else {
        Print invalid input, needs to be 0-2.
}
        Close the scanner.
```

## private String menu(Scanner scanner)
```
Print the menu
return scanner.nextLine()
```


        

