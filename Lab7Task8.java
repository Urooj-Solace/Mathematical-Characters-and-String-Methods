import java.util.Scanner;

public class Lab7Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String s = input.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        String result = s.substring(0, first) + s.substring(last);

        System.out.println("Correct Answer: " + result);
    }
}
