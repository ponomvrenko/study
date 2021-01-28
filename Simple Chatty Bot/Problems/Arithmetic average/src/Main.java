import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = 0;
        double index = 0;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                sum += a;
                index++;
            }
        }

        System.out.println(sum / index);
    }
}