public class DayCategories {
  public static void main(String[] args) {
    int day=4;
    if(day>7){
      System.out.println("invalid enter between 1 to 7");
    }
    else if(day >=1&& day<=5){
      System.out.println("WeekDays");
    }
    else if(day>5){
      System.out.println("Weekend");
    }
  }
}
