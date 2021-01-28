import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number = scanner.nextInt();

        boolean inRange = number > 0 && number < 10;

        System.out.println(inRange);
    }
}