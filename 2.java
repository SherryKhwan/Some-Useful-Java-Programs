class Main {
  public static void main(String[] args) {
    int hour = 13 ;
    int minute = 41 ;
    int second = 25 ;
    hour = hour * 3600 ;
    minute = minute * 60 ;
    double ans = hour + minute + second ;
    double total = 24 * 3600 ;
    System.out.print("Number of seconds since Midnight = ");
    System.out.println(ans);
    System.out.print("Number of seconds remaining = ");
    System.out.println(total - ans);
    System.out.print("Percentage of day passed = ");
    System.out.print( ( ans / total ) * 100 );
    System.out.println("%");
  }
}