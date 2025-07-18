
import java.util.Scanner;

public class Inch2cm {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Your Inch");
    int x=sc.nextInt();
    double cm=x*2.54;
    System.err.println("After Coversion " + cm);
    sc.close();
  }
}
