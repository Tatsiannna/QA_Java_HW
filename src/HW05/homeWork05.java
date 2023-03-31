package HW05;

public class homeWork05 {
    public static void main(String[] args){

        //Задачи на циклы, вывести следующие строки с соответствующим форматированием (как пирамиды):
        /*Задача №1
        0  1  2  3  4  5  6  7  8  9
        0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
        0  1  2  3  4  5  6
        0  1  2  3  4  5
        0  1  2  3  4
        0  1  2  3
        0  1  2
        0  1
        0                            */
        for (int i = 10; i >= 0; i-- ) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        Задача №2
        0  1  2  3  4  5  6  7  8  9
           0  1  2  3  4  5  6  7  8
              0  1  2  3  4  5  6  7
                 0  1  2  3  4  5  6
                    0  1  2  3  4  5
                       0  1  2  3  4
                          0  1  2  3
                             0  1  2
                                0  1
                                   0
         */
        for (int k = 10; k >= 0; k--) {
            for (int l = 10; l > k; l--) {
                System.out.print("  ");
            }

            for (int l = 0; l < k; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        /* Задача №3
        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
              6 5 4 3 2 1 0 1 2 3 4 5 6
                5 4 3 2 1 0 1 2 3 4 5
                  4 3 2 1 0 1 2 3 4
                    3 2 1 0 1 2 3
                      2 1 0 1 2
                        1 0 1
                          0
         */

        for (int a = 10; a >= 0; a--) {
            for (int b = 10; b > a; b--) {
                System.out.print("  ");
            }
            for (int b = a - 1; b > 0; b--){
                System.out.print(b + " ");
            }
            for (int b = 0; b < a; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }


    }
}
