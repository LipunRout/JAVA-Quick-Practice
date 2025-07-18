public class Switch {
  public static void main(String[] args) {
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("MON");
        break;
      case 2:
        System.out.println("TUE");
        break;
      case 3:
        System.out.println("WED");
        break;
      case 4:
        System.out.println("THR");
        break;
      case 5:
        System.out.println("FRI");
        break;
      case 6:
        System.out.println("SAT");
        break;
      case 7:
        System.out.println("SUN");
        break;

      default:
        System.out.println("Not valid");
    }
  }
}
