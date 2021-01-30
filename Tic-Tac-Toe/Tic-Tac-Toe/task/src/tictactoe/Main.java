package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");

        String input = scanner.next();

        char[] array = input.toCharArray();

        System.out.println("---------");
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 3 || i == 6) {
                System.out.print("|" + " " + array[i]);
            } else if (i == 2 || i == 5 || i == 8) {
                System.out.print(array[i] + " " + "|" + "\n");
            } else {
                System.out.print(" " + array[i] + " ");
            }
        }
        System.out.println("---------");
    }
}
