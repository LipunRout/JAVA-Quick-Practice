public class UppertoLower {
  public static void main(String[] args) {
    char ch='A';
    if(ch>='A' && ch<='Z'){
      ch=(char)(ch+32);
    }
    System.out.println(ch);
  }
}
