public class LCM {
  public static void main(String[] args) {
    int a=10,b=5;
    int small = (a>b) ? b:a;
    int gcd=1;
    for(int i=1;i<=small;i++){
      if(a%i==0 && b%i==0){
        gcd=i;
      }
    }
    int LCM =(a*b)/gcd;
    System.out.println(LCM);
  }
}
