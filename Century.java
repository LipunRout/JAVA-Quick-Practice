import java.util.Scanner;

public class Century {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter YOur year");
    int year=sc.nextInt();
    System.out.println((year%100==0)?"Yes":"No");

  }
}
