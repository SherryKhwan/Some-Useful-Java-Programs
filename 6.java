import java.util.Scanner ;
public class Main {
  public static void main(String[] args) {
  // Program to convert seconds to hours mins & secs
  int s , sec , m , h ;
  Scanner in = new Scanner(System.in);
  System.out.print("Enter Seconds: ");
  s = in.nextInt() ;
  sec = s % 60 ;
  m = s / 60 ;
  h = m / 60 ;
  System.out.printf("%s Seconds = %s hour(s), %s minutes, and %s seconds." , s , h , m , sec );
  }
}