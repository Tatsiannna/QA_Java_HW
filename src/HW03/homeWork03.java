package HW03;

import java.util.Scanner;

public class homeWork03 {
    public static void main(String[] args){

        /* Задача №1
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a  */

        int a;
        int b;
        System.out.println("Enter two numbers for a and b: ");

        Scanner a_number = new Scanner(System.in);
        a = a_number.nextInt();
        Scanner b_number = new Scanner(System.in);
        b = b_number.nextInt();

        if (a == b){
            System.out.println("a equal to b");
        }
        else if (a < b){
            System.out.println("a less than b");
        }
        else{
            System.out.println("b less than a");
        }


        /* Задача №2
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная */

        if ((a % 2 == 0) && (b % 2 == 0)){
            System.out.println("a and b are even");
        }
        else{
            System.out.println("some variable is odd");
        }

        /* Задача №3
        Необходимо создать целочисленную переменную, присвоить произвольное значение
        переменной на ваш выбор и вывести следующие строки:
        > больше 10 - если переменная больше 10
        > меньше 100 - если переменная меньше 100
        > результат деления на 2 больше 20 - если это соответствует истине
        > значение переменной между 5 и 40 включительно - если это правда
        > значение переменной меньше 5 или больше 40 - если предыдущие условие ложное */

        int x = 2;

        if (x > 10){
            System.out.println("x greater than 10");

            if (x < 100) {
                System.out.println("x less than 100");

                if ((x / 2) > 20) {
                    System.out.println("If it is appropriate");

                    if ((x >= 5) && (x <= 40)) {
                        System.out.println("If it is true");
                    }
                    else {
                        System.out.println("x < 5 or x > 40");
                    }
                }
                else {

                    if ((x >= 5) && (x <= 40)) {
                        System.out.println("If it is true");
                    }
                    else {
                        System.out.println("x < 5 or x > 40");
                    }
                }
            }
        }
        else{
            System.out.println("x less than 10");
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int z = 12;
        if (z > 10) {
            System.out.println("z > 10");
        }  if (z < 100) {
            System.out.println("z < 100");
        }  if ((z / 2) > 20) {
            System.out.println("true");
        }   if (z >= 5 && z <= 40) {
            System.out.println("5 <= z => 40");
        } else {
            System.out.println("false");}
    }
}
