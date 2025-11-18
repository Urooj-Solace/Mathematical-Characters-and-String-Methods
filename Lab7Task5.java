import java.util.Scanner;

public class Lab7Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
