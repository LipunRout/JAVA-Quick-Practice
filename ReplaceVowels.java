public class ReplaceVowels {
  public static void main(String[] args) {
    String s="Lipun";
    s=s.trim();
    String s1="";
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        ch='*';
      }
      s1+=ch;
    }
    System.out.println(s1);
  }
}
