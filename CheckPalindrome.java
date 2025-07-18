public class CheckPalindrome {
  public static void main(String[] args) {
    String s="CTC";
    String rev="";
    int len=s.length();
    
    for(int i=len-1;i>=0;i--){
      rev+=s.charAt(i);
    }
    if(rev.equals(s)){
      System.out.println("Yes It's Palindrome");
    }
    else{
      System.out.println("NO");
    }
  }
}
