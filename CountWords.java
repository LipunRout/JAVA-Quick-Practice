public class CountWords {
  public static void main(String[] args) {
    String s="I Am A Good BOY";
    String[] s1=s.trim().split("\\s+");
    System.out.println(s1.length);
  }
}
