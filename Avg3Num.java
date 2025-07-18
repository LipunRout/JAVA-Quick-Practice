
import java.util.Scanner;

public class Avg3Num {
  public static void main(String[] args) {
    System.out.println("Enter Your 3 number");
    Scanner sc =new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    double avg=(x+y+z)/3;
    System.out.println(avg);

  }
}
