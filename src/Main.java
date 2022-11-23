//        1)Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//        2) Вывести все простые числа от 1 до 1000
//        3) Реализовать простой калькулятор
//        4) *+Задано уравнение вида q + w = e, где q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Task1();
//        Task2();
        Task3();
    }


    //Задание 1
    public static void Task1() {
        System.out.println(" 1)Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Triangle(n));
        System.out.printf("Факториал: %d", Factorial(n));
    }

    public static int Factorial(int number) {
        int answer = 0;
        if (number > 0) {
            answer = number;
            return Factorial(--number, answer);
        } else {
            return answer;
        }

    }

    public static int Factorial(int number, int answer) {
        if (number > 0) {
            answer *= number;
            return Factorial(--number, answer);
        } else {
            return answer;
        }
    }

    public static int Triangle(int number) {
        int answer = 0;
        if (number > 0) {
            answer = number;
            return Triangle(--number, answer);
        } else {
            return answer;
        }
    }

    public static int Triangle(int number, int answer) {
        if (number > 0) {
            answer += number;
            return Triangle(--number, answer);
        } else {
            return answer;
        }

    }

    //Задание 2

    public static void Task2() {
        System.out.println("2. Вывести все простые числа от 1 до 1000");
        int number = 1000;
        for (int i = 1; i <= number; i++) {
            boolean flag = true;
            for (int j = 2; j < i && flag == true; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void Task3() {
        System.out.println("Реализовать простой калькулятор");
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        float currentNumber = 0;
        float operand = 0;
        int operation = 0;
        while(flag) {
            System.out.printf("1.Сложить\n2.Отнять\n3.Умножить\n4.Разделить\n5.Обнулить текущее число\n9.Выход\nТекущее число: %f\nВведите команду:", currentNumber);
            operation = scanner.nextInt(); //здесь ещё нужно отработать исключение - только int (как то через try catch)
            switch (operation) {
                case (1):
                    System.out.print("Введите второе слогаемое: ");
                    operand = scanner.nextFloat();
                    currentNumber += operand;
                    break;
                case (2):
                    System.out.print("Введите вычитаемое число: ");
                    operand = scanner.nextFloat();
                    currentNumber -= operand;
                    break;
                case (3):
                    System.out.print("Введите второй множитель: ");
                    operand = scanner.nextFloat();
                    currentNumber *= operand;
                    break;
                case (4):
                    System.out.print("Введите делитель число: ");
                    operand = scanner.nextFloat();
                    currentNumber /= operand;
                    break;
                case (5):
                    currentNumber = 0;
                    break;
                case (9):
                    flag = false;
                    System.out.println("До скорых встреч");
                    break;
                default:
                    System.out.println("Некоректный ввод");
                    break;

            }

        }

    }




}



