
import java.util.Scanner;

public class SimpleIntrest {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter P ");
    int p=sc.nextInt();
    System.out.println("Enter T ");
    int t=sc.nextInt();
    System.out.println("Enter R ");
    double r=sc.nextDouble();

    double am=(p*t*r)/100;
    System.out.println("Intrest is "+am);
  }
  
}
