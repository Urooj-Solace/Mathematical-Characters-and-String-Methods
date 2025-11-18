import java.util.Scanner;

public class Lab7Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String s = input.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        String start = s.substring(0, first + 1);
        String middle = s.substring(first + 1, last).replace('h', 'H');
        String end = s.substring(last);

        System.out.println("Correct Answer: " + (start + middle + end));
    }
}
