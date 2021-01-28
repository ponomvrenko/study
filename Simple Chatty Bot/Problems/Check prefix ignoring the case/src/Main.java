import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        if (str.startsWith("J") || str.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}