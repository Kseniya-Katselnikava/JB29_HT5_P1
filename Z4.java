//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
package by.epam.jb29.task08_1;

public class Z4 {
    public static void main(String[] args) {
        int [] arr = {1, 5, 0, 8, 18, 20, 24, 40};
        boolean flag = false;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Последовательность является возрастающей");
        }
        else {
            System.out.println("Последовательность не является возрастающей");
        }
    }
}
