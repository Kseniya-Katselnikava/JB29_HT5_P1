//Дан одномерный массив A[N]. Найти:
package by.epam.jb29.task08_1;

public class Z14 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double min;
        double max = 0;
        double sum;

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = Math.random() * 90.0D + -40.0D;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        min = arr[0];

        for(int i = 2; i < arr.length; i*=2) {
                if (arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i = (i * 2) + 1) {
            if (arr[i] < min && i > 0) {
                min = arr[i];
            }
        }
        sum = min + max;

        System.out.printf("Сумма минимального и максимального элементов равна: %.3f", sum);
    }
}
