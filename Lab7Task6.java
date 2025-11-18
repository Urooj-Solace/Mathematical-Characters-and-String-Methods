import java.util.Scanner;

public class Lab7Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String s = input.nextLine();

        int space = s.indexOf(' ');
        String first = s.substring(0, space);
        String second = s.substring(space + 1);

        System.out.println("Correct Answer: " + second + " " + first);
    }
}
