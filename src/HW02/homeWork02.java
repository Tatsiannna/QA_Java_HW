package HW02;

import java.util.Scanner;

public class homeWork02 {

    public static void main(String[] args){

        /* Задача №1
        Необходимо создать целочисленные переменные a и b,
        присвоить произвольные значения переменным на ваш выбор
        и вывести результаты следующих операций с этими переменными:
        сложение, умножение, вычитание, деление. */
        int a = 2;
        int b = 3;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (a * 1.0/ b);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);


        /* Экстра задача
        Также вывести остаток от деления и сделать проверку на четность этих переменных. */
        int x;
        int y;
        System.out.println("Enter two numbers: ");

        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        Scanner input2 = new Scanner (System.in);
        y = input2.nextInt();

        double result = (x * 1.0) / y;
        if (result % 2 == 0)
            System.out.println("Number is EVEN: " + result);
        else
            System.out.println("Number is ODD:" + result);

        /* Экстра задача
        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом). */
        String emoji = "\ud83d\ude00";
        String emoji2 = "\ud83d\ude01";

        System.out.println(emoji);
        System.out.println(emoji2);

    }
}

