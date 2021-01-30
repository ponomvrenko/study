import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = scanner.nextInt();
            sum = sum + num;

            if (num == 0) {
                System.out.println(sum);
                break;
            }

        }
    }
}