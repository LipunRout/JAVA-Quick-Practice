public class CharAtEven {
  public static void main(String[] args) {
    String s="lipun";
    for(int i=0;i<s.length();i++){
      if(i%2==0){
        System.err.print(s.charAt(i));
      }
    }
  }
}
