import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    int c = 0, i = 1;
    Random r = new Random();
    int w = r.nextInt(100) + 1;
    System.out.println("Assalam-o-Alikum");
    Scanner scan = new Scanner (System.in);
    System.out.print("What is your name? ");
    String N = scan.nextLine();
    System.out.print("\nHello " + N + "! \nThis is just a simple game made by Shaheryar Ahmed Khan using basic JAVA programming.\n\n In this game first of all computer will choose a number between 1 to 100 randomly & tell you to guess the number and if you guess in 5 turns than you will become a winner. Hope you like it!!\nThe computer had chose a number between 1 and 100. Guess the number!!\n");
    while ( c == 0 && i < 6 ) {
      Scanner in = new Scanner (System.in);
      System.out.print("\nEnter a Number: ");
      int a = in.nextInt();
      if ( a == w ) {
        c = c + 1 ;
        System.out.print("Congratulations " + N + "!! You win...! You guessed in " + i + " turn(s).");
      }
      if ( a > w ) {
        System.out.print("Sorry! You guessed a high Number. Try Again.\n");
      }
      if ( a < w ) {
        System.out.print("Sorry! You guessed a low Number. Try Again.\n");
      }
      i = i + 1 ;
    }
    if ( c == 0 ) {
      System.out.print("\nSorry " + N + "! You didnot guess the Number.. The Number was: " + w );
    }
    
  }
}