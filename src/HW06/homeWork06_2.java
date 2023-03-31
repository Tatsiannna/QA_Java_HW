package HW06;

public class homeWork06_2 {
    public static void main(String[] args) {

//        RunTask3();

        /* Задача №1
        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
        Для указанной строки ответ будет “ооооо” (или в столбик)
         */
        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println('о');
            }
        }

        /* Задача №2
        Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.
         */
        String str = "Перевыборы выбранного президента";
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'е') {
                count++;
            }
        }
        System.out.println(count);

        /* Задача №3
        Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        Для указанной строки ответ будет 6, 15, 29. */

        String str_ = "Посмотрите как Рите нравится ритм";
        String substr = "рит";
        for (int i = 0; i < str_.length() - substr.length(); i++) {
            if (substr.equalsIgnoreCase(str_.substring(i, i + substr.length()))) {
                System.out.println(i);
            }
        }
        /*String s_ = str_.toLowerCase();
        String substr = "рит";

        int index = str_.indexOf(substr);
        while (index != -1) {
            System.out.println(index);
            index = str_.indexOf(substr, index + 1);
        }
         */

  /* public static void RunTask3(){
        java.lang.String s_ = "Посмотрите как Рите нравится ритм";
        String sub = "рит";
        System.out.printf("\n Count of \"%s\" is %s \n", sub, CountSubstr( s_,  sub));
    }

    public static int CountSubstr(String str, String sub){
        return str.toLowerCase().split(sub.toLowerCase()).length;
    } */

        /* Экстра задача
        Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
         */

        String[][] array_ = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        for (int i =0; i < array_.length; i++) {
            for (int j = 0; j < array_[i].length; j ++) {

                // boolean noE = true;
                //  for (int k = 0; k < array[i][j].length(); k++) {
                //   if (array[i][j].charAt(k) == 'е') {
                //       noE = false;
                //     }
                //   }
                //   if (noE){
                //        System.out.println(array[i][j]);
                if(array_[i][j].indexOf('е') == -1) {
                    System.out.println(array_[i][j]);
                }
            }
        }



    }
}


