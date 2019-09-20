//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//        чисел несколько, то определить наименьшее из них.
package by.epam.jb29.task08_1;

public class Z18 {
    public static void main(String[] args) {
        int [] arr = {3, 5, 3, 6, 8, 7, 4, 7, 8 , 7, 3};
        int [] arr_count = new int [arr.length];
        int count = 1;
        int max_count = 0;
        int min;
        int icount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            arr_count[i] = count;
            count = 1;
        }

        int count_znach = 0;
        for (int i = 0; i < arr_count.length; i++) {
            if (arr_count[i] > max_count) {
                max_count = arr_count[i];
              }
        }

        for (int i = 0; i < arr_count.length; i++) {
            if (arr_count[i] == max_count) {
               count_znach++;
               icount = i;
            }
        }

        if (count_znach == 1) {
            for (int i = 0; i < arr_count.length; i++) {
                if (arr_count[i] == max_count) {
                    System.out.println("Наиболее часто встречающееся число: " + arr[i]);
                }
            }
        }
        else {
            min = arr[icount];
            for (int i = 0; i < arr_count.length; i++) {
                if (arr_count[i] == max_count && arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Наиболее часто встречающееся наименьшее число: " + min);
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr_count[i] + "\t");
//        }
    }
}
