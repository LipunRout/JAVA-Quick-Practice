
import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    System.out.println("Enter Sub number");
    Scanner sc=new Scanner(System.in);
    int sub=sc.nextInt();
    int total=0;
    for(int i=1;i<=sub;i++){
      System.out.println("Enter Sub"+i+"Mark");
      int mark=sc.nextInt();
      total+=mark;
    }
    double percent=((double)total/600)*100;
    if(percent>=90){
      System.out.println("A");
    }
    else if(percent>=60 && percent<90){
      System.out.println("B");
    }
    else{
      System.out.println("Fail");
    }
  }
}
