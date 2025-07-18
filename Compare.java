public class Compare {
  public static void main(String[] args) {
    String s1="Lipun";
    String s2="Lipun";
    int count=0;
    
    if(s1.length()==s2.length()){
      for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)==s2.charAt(i)){
          count++;
        }
      }
      int len=s1.length();
      if(count==len){
        System.out.println("Equals");
      }
    }
  }
}
