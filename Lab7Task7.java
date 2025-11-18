import java.util.Scanner;

public class Lab7Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String s = input.nextLine();

        int first = s.indexOf('f');
        int last = s.lastIndexOf('f');

        if (first != -1 && last != -1 && first != last) {
            System.out.println("Correct Answer: " + first + " " + last);
        } else if (first != -1) {
            System.out.println(first);
        }
    }
}
