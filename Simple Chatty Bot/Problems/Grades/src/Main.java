import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();

            if (grade == 2) {
                gradeD++;
            } else if (grade == 3) {
                gradeC++;
            } else if (grade == 4) {
                gradeB++;
            } else if (grade == 5) {
                gradeA++;
            }
        }

        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);

    }
}