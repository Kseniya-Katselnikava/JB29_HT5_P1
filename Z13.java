//Определить количество элементов последовательности натуральных чисел, кратных числу М и
//        заключенных в промежутке от L до N.
package by.epam.jb29.task08_1;

import java.util.Random;

public class Z13 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random ran = new Random();
        int M = 5;
        int L = 3;
        int N = 20;
        int count = 0;

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = ran.nextInt(40);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] % M == 0 && arr[i] >= L && arr[i] <= N){
                count++;
            }
        }
        System.out.println("Количество элементов равно: " + count);

    }
}
