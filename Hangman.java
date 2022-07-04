import java.util.Scanner;

public class HangmanTester {
     
     public static void main(String[] args) {
          Scanner kb = new Scanner(System.in);
          System.out.println("Enter a word for a person to guess");
          String word = kb.nextLine();
          Hangman h1 = new Hangman(word);
          
          while (h1.getGuessesIncorrect() != 6) {
              try {
                   String letter = kb.next();
                   if (letter.length() > 1 || !letter.matches("[a-zA-Z]+")) {
                        throw new Exception("Must enter a character");
                   }
                   
                   char letterChar = letter.charAt(0);
                   h1.guess(letterChar);
              } catch (Exception e) {
                   System.out.println("Must enter a character");
              }
          }
     }
}


//Main code

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
     private String[] stickFigure = {" O", "/", "|", "\\", "/", " \\"};
     private char[] word;
     private String originalWord = "";
     private int guessesIncorrect = 0; // 6 guesses
     private ArrayList<Character> letters = new ArrayList<Character>();
     
     public Hangman(String word) {
          Scanner kb = new Scanner(System.in);
          while (!word.matches("[a-zA-Z]+")) {
              System.out.println("Only enter characters");
              word = kb.next();
              }
          this.word = word.toCharArray();
          originalWord = word;
     }
     
     public int getGuessesIncorrect() {
          return guessesIncorrect;
     }
     
     public void checkWin(String returningWord) {
          String stringWord = "";
          
          for (char i: word) {
              stringWord += i;
          }
          if (returningWord.equals(stringWord)) {
              System.out.println("You won");
          } else if (guessesIncorrect == 6) {
              System.out.println("You lost, the word was " + originalWord);
          }
     }
     
     private void checkCharacter(char character) {
          boolean notInWord = true;
          char[] word = new char[this.word.length];
          for (int n = 0; n < this.word.length; n++) {
              for (int k = 0; k < letters.size(); k++) {
                   if (this.word[n] == letters.get(k)) {
                        word[n] = this.word[n];
                        notInWord = false;
                   }
              }
          }
          
          for (int i = 0; i < word.length; i++) {
              if (word[i] == ' ') {
                   word[i] = '_';
              }
          }
          String returningWord = "";
          for (int x = 0; x < word.length; x++) {
              returningWord += word[x];
          }
          if (notInWord) {
              guessesIncorrect++;
              
              if (guessesIncorrect >= 1) {
                   System.out.println(stickFigure[0]);
              }
              
              if (guessesIncorrect >= 3) {
                   System.out.print(stickFigure[1]);
              }
              
              if (guessesIncorrect >= 2) {
                   if (guessesIncorrect == 2) {
                        System.out.println(" " + stickFigure[2]);
                   } else
                   System.out.print(stickFigure[2]);
              }
              
              if (guessesIncorrect >= 4) {
                   System.out.println(stickFigure[3]);
              }
              
              if (guessesIncorrect >= 5) {
                   System.out.print(stickFigure[4]);
              }
              
              if (guessesIncorrect >= 6) {
                   System.out.println(stickFigure[5]);
              }
              
              if (guessesIncorrect == 3) {
                   System.out.println();
              }
              System.out.println();
              System.out.println("Letter is not in word, you have " + guessesIncorrect + " guesses incorrect");
          } else {
              System.out.println(returningWord);
          }
          checkWin(returningWord);
     }
     
     public void guess(char character) {
          boolean execute = true;
          for (int n = 0; n < letters.size(); n++) {
              if (letters.get(n).equals(character)) {
                   execute = false;
              }
          }
          
          if (execute) {
              letters.add(character);
              checkCharacter(character);
          } else {
              System.out.println("Character already guessed");