public class RemoveSpace {
  public static void main(String[] args) {
    String s=" Lipun Rout ";
    String s2="";
    for (int i = 0; i < s.length(); i++) {
      
      if (s.charAt(i)!=' ') {
        s2+=s.charAt(i);
      }
     
    }
    System.out.println(s2);
  }
}
