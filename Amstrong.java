public class Amstrong {
  public static void main(String[] args) {
    int n=153;
    int temp1=n;
    int temp=n;
    int count=0;
    int sum=0;
    while(n>0){
      count++;
      n/=10;
    }
    while(temp>0){
      int rem=temp%10;
      sum+=Math.pow(rem, count);
      temp/=10;
    }
    if(temp1==sum){
      System.out.println("YES");
    }
    else{
      System.out.println("NO!!!");
    }
  }
}
