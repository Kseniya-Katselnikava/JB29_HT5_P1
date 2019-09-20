//Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L
//        < М-1).
package by.epam.jb29.task08_1;

import java.util.Random;

public class Z11 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random ran = new Random();
        int M = 5;
        int L = 3;
        int ost;

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = ran.nextInt(40);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n\nОстаток от деления на М равен L у чисел:");

        for(int i = 0; i < arr.length; ++i) {
            ost = arr[i] % M;

            if (ost == L && L > 0 && L < M - 1) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
