// /**
//  * program
//  */
// public class program {
//     public static void main(String[] args) {
//         // System.out.println("world");
//         // float f = 12155.55f;
//         // System.out.println(f);
//         // double d = 1235544.212;
//         // System.out.println(d);
//         // char ch = 'f';
//         // System.out.println(ch);
//         // char chn = 97; // выведет соответствующий этому коду символ, здесь "a"
//         // System.out.println(chn);
//         // boolean flag = 123 <= 456;
//         // System.out.println(flag);
//         // boolean flag1 = true ^ false; // строгое "или"
//         // System.out.println(flag1);
//         // String msg = "Hello world!";
//         // System.out.println(msg);
//         // var x = 1_123_456; // можно разделять разряды нижним подчеркиванием
//         // System.out.println(x);
//         // System.out.println(getType(x));
//         // System.out.println("Max = " + Integer.MAX_VALUE); //максимальное значение типа int
//         // String s = "world";
//         // char ch = s.charAt(1); // выбор из строки символа с определенным индексом
//         // System.out.println(ch);
//         // int a = 123;
//         // a++;
//         // System.out.println(a); // 124
//         // System.out.println(a++); // приоритет вывода на экран выше приоритета ЭТОГО инкримента - 124
//         // System.out.println(a); // 125
//         // System.out.println(++a); // а приоритет ЭТОГО инкримента выше приоритета вывода на экран - 126
//         // a = 7;
//         // a = --a-a--; // 0
//         // a = a-- - --a; // 2
//         // System.out.println(a);
//         // int [] arr = new int [10]; // инициализация массива
//         // arr = new int[] {1,2,3,4,5}; // инициализация + значения
//         // // arr[3] = 13;
//         // System.out.println(arr[3]);
//         // System.out.println(arr.length); // длина массива
//         int[][] arr = new int[3][5]; // инициализация многомерного массива с выводом
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }

//     // static String getType(Object o) { // метод для определения типа переменной
//     //     return o.getClass().getSimpleName();
//     // }
//     }
// }

// import java.util.Scanner; // получение данных из терминала
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }