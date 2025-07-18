
import java.util.Scanner;

public class Fa2ce {
  public static void main(String[] args) {
    System.out.println("Enter Fahrenheit ");
    Scanner sc=new Scanner(System.in);
    double fa=sc.nextDouble();
    double ce=(fa-32)*5/9;
    System.out.println("After conversion "+ ce);
  }
}
