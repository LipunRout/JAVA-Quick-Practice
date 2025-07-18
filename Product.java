public class Product {
  public static void main(String[] args) {
    int n=12345;
    int p=1;
    while(n>0){
      int rem=n%10;
      p*=rem;
      n/=10;
    }
    System.out.println(p);
  }
}
