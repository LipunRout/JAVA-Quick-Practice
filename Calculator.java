public class Calculator {
  public static void main(String[] args) {
    char ch='+';
    int a=8,b=7;
    switch (ch) {
        case '+' :
            System.out.println(a+b);
            break;
        case '-':
        System.out.println(a-b);
            break;
        default:
            System.out.println("NOt A valid symbol");
    }
  }
}
