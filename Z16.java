//Даны действительные числа 𝑎1, 𝑎2, … , 𝑎2𝑛. Найти
package by.epam.jb29.task08_1;

import java.util.Random;

public class Z16 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[2 * n];
        int max = 0;
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr.length / 2; i++) {
            int sum = arr[i] + arr[arr.length-1 - i];

            if (sum > max) {
                max = sum;
            }
            }
        System.out.println("Максимальное значение равно: " + max);
    }
}
