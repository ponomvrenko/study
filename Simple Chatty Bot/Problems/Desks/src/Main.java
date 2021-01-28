import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int desks1;
        int desks2;
        int desks3;

        if (group1 % 2 == 1) {
            desks1 = group1 / 2 + 1;
        } else {
            desks1 = group1 / 2;
        }

        if (group2 % 2 == 1) {
            desks2 = group2 / 2 + 1;
        } else {
            desks2 = group2 / 2;
        }

        if (group3 % 2 == 1) {
            desks3 = group3 / 2 + 1;
        } else {
            desks3 = group3 / 2;
        }

        int res = desks1 + desks2 + desks3;
        System.out.println(res);


    }
}