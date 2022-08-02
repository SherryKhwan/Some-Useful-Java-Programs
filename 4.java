import java.util.Scanner;
public class Main { //Convert centimeters to inch and feet
 public static void main(String[] args) {
   
   double ft , inch , centi ;
   Scanner in = new Scanner(System.in);
   System.out.print("Enter Centimeters: ");
   centi = in.nextDouble();
   inch = centi / 2.5 ;
   ft = inch / 12 ;
   System.out.println("Inches: " + inch );
   System.out.printf("Feet: = %.2f" , ft );

 }
}