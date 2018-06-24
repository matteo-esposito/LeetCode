// --------------------------------------------------------------------
// Matteo Esposito
// May 2018
//
// This program will verify the primality of any positive integer.
// --------------------------------------------------------------------

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        // Get user input.
        System.out.print("Enter a number you wish to test: ");
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();

        // Prime number status
        boolean primeStatus = true;

        // Check for (0 or 1) case, even and odd divisors (only their roots to speed us processing time).
        for (int i = 3; i*i < userNumber; i += 2) {
            if (userNumber < 2 || userNumber % 2 == 0 || userNumber % i == 0) {
                primeStatus = false;
            } else {
                primeStatus = true;
            }
        }

        // Exception Handling.
        if (userNumber <0) {
            System.out.println("Invalid input. Enter a number larger than 0.");
            System.exit(0);
        }

        // Print status.
        System.out.println("The claim that " + userNumber + " is prime is " + primeStatus + ".");
    }
}
