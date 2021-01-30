import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long firstNum = scanner.nextLong();
        String operator = scanner.next();
        long secondNum = scanner.nextLong();
        long result;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                System.out.println(result);
                break;
            case "-":
                result = firstNum - secondNum;
                System.out.println(result);
                break;
            case "/":
                if (firstNum == 0 || secondNum == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                result = firstNum / secondNum;
                System.out.println(result);
                break;
            case "*":
                if (firstNum == 0 || secondNum == 0) {
                    System.out.println("Multiplication by 0!");
                    break;
                }
                result = firstNum * secondNum;
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;

        }
    }
}