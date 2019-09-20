//Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой
//        последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
package by.epam.jb29.task08_1;

public class Z5 {
    public static void main(String[] args) {
        int [] arr = {0, 5, 7, 6, 8, 5, 1, 13};
        int size = 0;
        int [] chet;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                size++;
            }
        }

        chet = new int [size];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                chet[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < chet.length; i++) {
            System.out.print(chet[i] + "\t");
        }
    }
}
