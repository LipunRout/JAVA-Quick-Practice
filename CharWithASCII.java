public class CharWithASCII {
  public static void main(String[] args) {
    String s="Lipun";
    for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
      int ASCII=(int)(ch);
      System.out.println(ch+"  "+ASCII);
    }
  }
}
