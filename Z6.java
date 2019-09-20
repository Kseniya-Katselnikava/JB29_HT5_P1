//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти
//        числа.
package by.epam.jb29.task08_1;

public class Z6 {
    public static void main(String[] args) {
        int [] arr = {8, 5, 7, 6, 8, 5, 1, 13};
        int max = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Наименьшая длина числовой оси равна: " + (max - min));

    }
}
