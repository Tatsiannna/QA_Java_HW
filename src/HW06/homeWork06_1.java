package HW06;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class homeWork06_1 {

    public static void main(String[] args) {

        RunTask5();
        RunTask6();

        /* Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
        */
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        /* Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.
         */
        int max = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);

        /* Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.
         */
        int min = arr[0];

        for (int n = 0; n < arr.length; n++) {
            if (arr[n] < min) {
                min = arr[n];
            }
        }
        System.out.println(min);

        /* Задача №4 ******
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.
         */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        OptionalDouble average = IntStream.of(numbers).average();
        System.out.println(average);

        System.out.println("<<<<<<<<<<OR>>>>>>>>>>");

        double avrg = 0;
        double sum_ = 0;

        for (int m = 0; m < numbers.length; m++) {
            sum_ += numbers[m];
        }
        avrg = sum_ / numbers.length;

        System.out.println(avrg);

    }

    /* Задача №5
    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести сумму элементов массива.
     */
    public static void RunTask5() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = Sum(array);
        System.out.printf("Sum = %s \n", sum);
    }

    public static int Sum(int[][] array) {
        int sum = 0;
        for (int[] e : array) {
            for (int v : e) {
                sum += v;
            }
        }
        return sum;
    }

    /*Задача №6
    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести максимальное значение массива.
     */
    public static void RunTask6(){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max =  FindMaxElementOf(array);
        System.out.printf("Max = %s \n", max);
    }
    public static int FindMaxElementOf(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int[] e : array) {
            for (int v : e) {
                max = GeMaxOf(max, v );
            }
        }
        return max;
    }
    public static int GeMaxOf(int first, int second ){
        return first > second ? first : second;
    }

}






