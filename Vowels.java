public class Vowels {
  public static void main(String[] args) {
    String s="LipUn";
    String z="AEIOUaeiou";
    int count=0;
    int len=s.length();
    for(int i=0;i<len;i++){
      for(int j=0;j<z.length();j++){
        if(s.charAt(i)==z.charAt(j)){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
