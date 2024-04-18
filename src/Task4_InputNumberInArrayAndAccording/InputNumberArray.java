package Task4_InputNumberInArrayAndAccording;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class InputNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int length = sc.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i + 1) + " element");
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));
        while (true) {
            System.out.println("Choose :\n1. Ascending Order \n2. Descending order \n3. Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(Arrays.toString(Arrays.stream(array).sorted().toArray()));
                    break;
                case 2:
                    Arrays.sort(array);
                    reverseArray(array);
                    System.out.println(Arrays.toString(array));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Incorrect choice");
            }
        }
        }


    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
    }
}


