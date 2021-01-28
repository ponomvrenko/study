import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();

        text = text.substring(firstInt, secondInt + 1);
        System.out.println(text);
    }
}