public class Find1 {
  public static void main(String[] args) {
    int n=60;
    int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2==0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}
