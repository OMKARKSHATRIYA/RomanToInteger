
package cloudvandana;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char c = romanNumeral.charAt(i);
            int value = 0;

            if (c == 'I') {
                value = 1;
            } else if (c == 'V') {
                value = 5;
            } else if (c == 'X') {
                value = 10;
            } else if (c == 'L') {
                value = 50;
            } else if (c == 'C') {
                value = 100;
            } else if (c == 'D') {
                value = 500;
            } else if (c == 'M') {
                value = 1000;
            } else {
                System.out.println("Invalid Roman numeral character: " + c);
                return; // Exit the program if an invalid character is encountered
            }

            if (value < prevValue) {
                result =result - value;
            } else {
                result =result + value;
            }

            prevValue = value;
        }

        System.out.println("Integer value: " + result);
    }
}
