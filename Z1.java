//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
package by.epam.jb29.task08_1;

import java.util.Random;

public class Z1 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random ran = new Random();
        int K = 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(50);
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % K == 0) {
                sum += arr[i];
            }
        }
        System.out.println("\nСумма элементов равна: " + sum);
    }
}