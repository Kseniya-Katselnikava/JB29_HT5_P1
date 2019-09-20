//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
package by.epam.jb29.task08_1;

import java.util.Random;

public class Z9 {
    public static void main(String[] args) {
        double [] arr = new double[10];
        //Random ran = new Random();
        double min;
        int imin = 0, imax = 0;
        double max = 0;
        double buf;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (50 - (-40))) + (-40);;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
        }
        buf = max;
        arr[imax] = min;
        arr[imin] = buf;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
