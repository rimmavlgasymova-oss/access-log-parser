import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи первое число:");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введи второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
    }
}