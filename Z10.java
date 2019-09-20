//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
package by.epam.jb29.task08_1;

import java.util.Random;

public class Z10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(50);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
