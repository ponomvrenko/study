import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        first = first.replace(" ", "");
        second = second.replace(" ", "");

        if (first.equals(second)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}