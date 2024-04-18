package Task2_FindRandomNumber;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int guess=0;
        do {
            try {
                guess = getRequiredNumber("Enter the number you guessed : ");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a integer.");
                sc.nextLine();
                continue;
            }
            if (guess > randomNumber) {
                System.out.println("Too high");
            } else if (guess < randomNumber) {
                System.out.println("Too low");
            }
        } while (guess != randomNumber);
        {
            System.out.println("Random number is finded : " + guess);
            sc.close();
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static int getRequiredNumber(String text) {
        System.out.println(text);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }

        }
    }

    public static String getRequiredText(String text) {
        System.out.println(text);
        return sc.next();
    }
}
