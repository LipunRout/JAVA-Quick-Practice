public class Palindrome {
  public static void main(String[] args) {
    int num = 121;
    int temp=num;
    int rev = 0;
    while (num > 0) {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num /= 10;
    }
    if (rev==temp) {
      System.out.println("Yes Palindrome");
    } else {
      System.out.println("NO");
    }
  }
}
