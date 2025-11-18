import java.util.Scanner;

public class Lab7Task2 {

    // Part (a) — Reverse a number
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + (number % 10);
            number /= 10;
        }
        return rev;
    }

    // Part (b) — Check if the number is palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Reverse
        System.out.println("Reversed number: " + reverse(num));

        // Palindrome check
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }
}
