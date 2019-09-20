//Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше -
//        положительное или отрицательное.
package by.epam.jb29.task08_1;

public class Z3 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 8, 0, 6, 8, 0, 4, 0};

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                if (arr[i] > 0) {
                    System.out.println("Положительное число встречается раньше");
                    break;
                }

                if (arr[i] < 0) {
                    System.out.println("Отрицательное число встречается раньше");
                    break;
                }
            }
        }

    }
}
