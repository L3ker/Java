package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Оберіть завдання, натисніть цифру: \n1 - формула; \n2 - Цикли; \n3 - Сума Добутку; \n4 - Діапазон;");
        int ask = scan.nextInt();
        switch (ask) {
            case 1:
                boolean cycle = true;
                int x, y;
                while (cycle) {
                    System.out.println("Введіть 2 додатніх числа, з умовою, що x>y: ");
                    x = scan.nextInt();
                    y = scan.nextInt();
                    if (x > y) {
                        cycle = false;
                        double f = (Math.pow(x,2)+Math.pow(y,2))/(Math.sqrt(x-y));
                        System.out.println("f = " + (float)f);
                    } else {
                        System.out.println("Помилка вводу. Повторіть спробу.");
                    }
                }
                break;
            case 2:
                System.out.println("Оберіть спосіб:\n1 - З використанням циклу з параметром;\n2 - З використанням циклу з передумовою;\n3 - З використанням циклу з післяумовою;");
                ask = scan.nextInt();
                int sum = 0;
                int i;
                switch (ask) {
                    case 1 -> {
                        for (i = 1; i <= 10; i++) {
                            if (i % 2 == 0) {
                                sum += i;
                            }
                        }
                        System.out.println(Math.pow(sum,2));
                    }
                    case 2 -> {
                        i = 1;
                        while (i <= 10) {
                            if (i % 2 == 0) {
                                sum += i;
                            }
                            i++;
                        }
                        System.out.println(Math.pow(sum,2));
                    }
                    case 3 -> {
                        i = 1;
                        do {
                            if (i % 2 == 0) {
                                sum += i;
                            }
                            i++;
                        } while (i <= 10);
                        System.out.println(Math.pow(sum,2));
                    }
                    default -> System.out.println("Невірне число.");
                }
                break;
            case 3:
                int resx, resy = 0;
                System.out.println("Введіть число х: ");
                try{
                    int X = scan.nextInt();
                    if (X > 0) {
                        for (int I = 1; I <= 5; I++) {
                            resx = 1;
                            for (int j = 1; j <= I; j++) {
                                resx *= (I+Math.pow(X,j));
                            }
                            resy += resx;
                        }
                    }else{
                        throw new Exception();
                    }
                    System.out.println("Сума добутку формули: " + resy);
                }catch (Exception err){
                    System.out.println("Невірне число.");
                }
                break;
            case 4:
                double a = -Math.PI, b = Math.PI;
                double shag;
                Exception ERROR = new Exception();
                for (shag = a; shag <= b; shag += Math.PI/10) {
                    try{
                        if ((float)(Math.cos(shag)*Math.sin(shag)) != Double.POSITIVE_INFINITY)
                            System.out.println("x = " + (float)shag + "\t\t\ty = " + (float)(Math.cos(shag)*Math.sin(shag)));
                        else
                            throw ERROR;
                    }catch(Exception er)
                    {
                        System.out.println("x = " + shag + "\t\t\ty = Помилка значень.");
                    }
                }
                break;
            default:
                System.out.println("Невірне число.");
                break;
        }
    }
}


