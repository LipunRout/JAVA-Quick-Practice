public class Consonant {
  public static void main(String[] args) {
    String s = "LipUn";
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
           ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') &&
           Character.isLetter(ch)) {
        count++;
      }
    }

    System.out.println("Number of consonants: " + count);
  }
}
