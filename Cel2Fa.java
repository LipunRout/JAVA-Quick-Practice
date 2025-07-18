
import java.util.Scanner;

public class Cel2Fa {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter Celsius to convert");
    int ce=sc.nextInt();
    double fa=(ce*1.8)+32;
    System.out.println("After coversion "+ fa);
  }
  
}
