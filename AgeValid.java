import java.util.Scanner;

public class AgeValid {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Your Age ");
    int Age =sc.nextInt();
    System.out.println((Age>=18)?"Yes You Can VOte ": " No YOU Can't!!");
  }
}
