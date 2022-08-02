import java.util.Scanner ;
public class Main {
  public static void main(String[] args) {
  // Program to convert celcius to farenheit
  double c , f ;
  Scanner in = new Scanner(System.in);
  System.out.print("Enter Temperature in Centigrade: ");
  c = in.nextDouble() ;
  f = (c * 9 / 5) + 32 ;
  System.out.printf("Temperature in Farenheit: %.1f \n" , f);
  }
}