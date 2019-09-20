//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
//        этим числом. Подсчитать количество замен.
package by.epam.jb29.task08_1;

public class Z7 {
    public static void main(String[] args) {
        double [] arr = {0, 5.75, 7, 16.48, 8, 15.24, 1, 13};
        int count = 0;
        double Z = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Z) {
                arr[i] = Z;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nКоличество замен: " + count);
    }
}
