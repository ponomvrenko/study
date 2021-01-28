import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int res = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num % 4 == 0 && num > res) {
                res = num;
            }

        }
        System.out.println("\n" + res);
    }
}