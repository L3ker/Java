package com.company;

import java.util.ConcurrentModificationException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static double Distance(int x, int y, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Оберіть завдання: \n1 - if; \n2 - Неспадна послідовність; \n3 - Пори року; \n4 - Рівняння;");
        int task = scanner.nextInt();
        switch (task) {
            case 1:
                System.out.println("Оберіть спосіб:\n1 - З використанням скороченої форми;\n2 - З використанням повної форми");
                task = scanner.nextInt();
                try {
                    System.out.println("Введіть два додатніх числа b та c: ");
                    float b = scanner.nextFloat(), c = scanner.nextFloat();
                    switch (task) {
                        case 1:
                            if (b == 1)
                                System.out.println("a = " + (4 * b - 9 * c));
                            if (b == 2)
                                System.out.println("a = " + (Math.sqrt(2 - b * c)));
                            if (b == 3)
                                System.out.println("a = " + (b / Math.pow(c, 2)));
                            break;
                        case 2:
                            if (b == 1)
                                System.out.println("a = " + (4 * b - 9 * c));
                            else if (b == 2)
                                System.out.println("a = " + (Math.sqrt(2 - b * c)));
                            else if (b == 3)
                                System.out.println("a = " + (b / Math.pow(c, 2)));
                            else
                                System.out.println("No solution");
                            break;
                    }
                } catch (Exception ex) {
                    System.out.println("ERROR");
                }
                break;
            case 2:
                float[] num = new float[4];
                int i = 0;
                boolean nespad = false;
                System.out.println("Введіть 4 числа: ");
                while (i < 4) {
                    num[i] = scanner.nextInt();
                    i++;
                }
                i = 3;
                while (num[i] > num[i - 1]) {
                    if (i == 1) {
                        nespad = true;
                        break;
                    }
                    i--;
                }
                if (nespad == true) {
                    int sum = 0;
                    for (i = 0; i < 4; i++){
                        sum+=num[i];
                    }
                    System.out.println("Середнє арифметичне:"+ sum/4);
                }else{
                    int dob = 1;
                    for (i = 0; i < 4; i++){
                        dob*=num[i];
                    }
                    System.out.printf("Середнє геометричне: %.2f",+ (Math.pow(dob, 1.0/4)));
                }
                break;
            case 3:
                System.out.println("Введіть порядковий номер місяця: ");
                int month = scanner.nextInt();
                switch (month) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Літо");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осінь");
                        break;
                    default:
                        System.out.println("Невірне число.");
                        break;
                }
                break;
            case 4:
                try {
                    System.out.println("Введіть 2 додатніх числа x та y:");
                    float x = scanner.nextFloat(), y = scanner.nextFloat();
                    if (x <= 0 || y <= 0) {
                        throw new Exception();
                    }
                    double res = ((x + y) / (Math.pow(x, 2) - (x * y) + Math.pow(y, 2))) + (Math.sin(x / (1 - Math.pow(y, 2)))) + (Math.cos(y) / (1 - Math.pow(x, 2)));
                    System.out.printf("f = %.2f", + res);
                    break;
                } catch (Exception ex) {
                    System.out.println("Помилка. Введено невірні числа");
                }
                break;
            default:
                System.out.println("Невірне число.");
                break;
        }
    }
}
