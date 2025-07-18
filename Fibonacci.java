public class Fibonacci {
  public static void main(String[] args) {
    int n1=0,n2=1;
    System.out.println(n1);
    System.out.println(n2);
    int n=5;
    for(int i=2;i<n;i++){
      int fibbo=n1+n2;
      System.out.println(fibbo);
      n1=n2;
      n2=fibbo;

    }
  }
}
