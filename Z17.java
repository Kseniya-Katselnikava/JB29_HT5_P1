//Дана последовательность целых чисел. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны...
package by.epam.jb29.task08_1;

public class Z17 {
    public static void main(String[] args) {
        double [] arr = {7, 5, 1, 6, 8, 1, 1, 4};
        int count = 0;
        double min = arr[0];
        double [] arr1;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min =  arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                count++;
            }
        }
        arr1 = new double[arr.length - count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
               arr1[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i < arr1.length; ++i) {
           System.out.print(arr1[i] + "\t");
        }
    }
}
