import java.util.*;

public class some {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int a = input.nextInt();
    input.nextLine(); // consume leftover newline

    System.out.print("Enter a string: ");
    String b = input.nextLine();

    System.out.print("Enter a boolean (true/false): ");
    boolean conditionOne = input.nextBoolean();

    if (conditionOne) {
      System.out.println(a);
    } else {
      while (a >= 0) {
        System.out.println(b);
        a--;
      }
    }

    input.close();
  }
}
