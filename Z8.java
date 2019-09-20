//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//        положительных и нулевых элементов.
package by.epam.jb29.task08_1;

public class Z8 {
    public static void main(String[] args) {
        double [] arr = new double[10];
        int zero = 0;
        int count_positive = 0;
        int count_negative = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (50 - (-40))) + (-40);
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            }
            else if (arr[i] > 0) {
                count_positive++;
            }
            else if (arr[i] < 0) {
                count_negative++;
            }
        }
        System.out.println("\nКоличество нулевых элементов: " + zero);
        System.out.println("Количество положительных элементов: " + count_positive);
        System.out.println("Количество отрицательных элементов: " + count_negative);
    }
}