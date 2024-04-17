package Task2_FindRandomNumber;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int guess;
        do {
            guess = getRequiredNumber("Enter the number you guessed : ");
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
        return sc.nextInt();
    }

    public static String getRequiredText(String text) {
        System.out.println(text);
        return sc.next();
    }
}
