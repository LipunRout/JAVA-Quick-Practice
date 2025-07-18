public class Electriccity {
  public static void main(String[] args) {
    int unit=45;
    if(unit < 50){
      System.out.println("BILL IS"+(unit*3));
    }
    else if(unit>50 && unit<100){
      System.out.println("BILL IS"+(unit*6));
    }
    else{
      System.out.println("BILL IS"+(unit*8));
    }
  }
}
