public class Frequency {
  public static void main(String[] args) {
    String s1="Lipun Rout";
    char ch='u';
    int count=0;
    for (int i = 0; i < s1.length(); i++) {
      
      if (s1.charAt(i)==ch) {
        count++;
      }
    }
    System.out.println(count);
  }
}
