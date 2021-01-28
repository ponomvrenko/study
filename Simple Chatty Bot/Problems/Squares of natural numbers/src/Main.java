import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i = 1;
        int square = 0;

        while (square < n) {
            square = i * i;
            if (square > n) {
                break;
            }
            System.out.println(square);
            i++;
        }
    }
}