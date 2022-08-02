import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
   int c = 0, p = 0, r = 0, a = 0, s = 0, w = 0, x = 0, b = 0, m = 0;
   String N;
   System.out.println ("Head & Tail Game:");
   System.out.println ("=================  ");
   System.out.print("\nWhat is your Name? ");
   Scanner scan = new Scanner (System.in) ;
   String str = scan.nextLine();
   N = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
   System.out.println("\nHey " + N + "!! This is a simple game which we were used to play in our chilhood.\n\nRules:\n 1)First computer will bat.\n 2)You can choose any number between 1 to 6.\n 3)You cannot choose numbers greater than 6 or smaller than 1.\n 4)When computer will bat, you have to guess the number to out the computer.\n 5)When you bat, if computer guessed your chosen number you would be out.\nSo try to guess computer's number as soon as possible when you bowl and try to avoid number to be guessed when you bat.");
   System.out.print("\nComputer is batting now.");
   while ( c==0 ){
     Random rand = new Random();
     w = rand.nextInt(5) + 1 ;
     a = -1 ;
     while (a <= 0 || a > 6 ) {
       Scanner in = new Scanner (System.in) ;
       System.out.print("\nGuess the number: ");
       a = in.nextInt();
       if (a <= 0 || a > 6 ) {
         System.out.println("Remember! You cannot guess numbers greater than 6 or smaller than 1.");
       }
     }
       if ( a == w ) {
         s = p + 1 ;
         System.out.println("Bingo!! You made the correct guess..\nThe computer had scored " + p + " runs. Means you have to score atleast " + s + " runs to win.\n\nNow its your turns to bat.\nRemember! Try to avoid your number to be guessed.");
         c = c + 1 ;
       }
       else {
     System.out.println ("\nComputer chose " + w +" run(s).") ;
     p = p + w ;
     System.out.println ("Computer had scored a total of " + p + " run(s).");
       }
     }
     while ( c == 1 && p >= r ) {
       Random ran = new Random();
       x = ran.nextInt(5) + 1 ;
       b = -1 ;
       while ( b <= 0 || b > 6 ) {
         Scanner oo = new Scanner (System.in) ;
       System.out.print("\nMake a score: ");
       b = oo.nextInt();
       if (b <= 0 || b > 6 ) {
         System.out.println("Remember! You cannot guess numbers greater than 6 or smaller than 1.");
       }
     }
     if  ( b == x ) {
    System.out.println ("Alas! You got out! You had scored "+ r +" runs.\nThe Computer won!!");
    c++ ;
     }
     else {
    System.out.println ("\nComputer guessed "+ x +" run(s).");
    r = r + b ;
    System.out.println ( b +" runs added to your total score. You have score a Total of "+ r +" run(s).");
     }
    if (r < s && c == 1) {
      m = s - r ;
      System.out.println ("You need "+ m +" more runs.");
    }
   } 
    if ( r == p ) {
    System.out.println ("The match had been drawn!!");
    }
    if ( r > p ) {
    System.out.println ("\nCongratulations " + N + "! You have defeated the computer..ðŸ˜Ž");
    }
  }
}

