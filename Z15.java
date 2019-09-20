//Дана последовательность действительных чисел . Указать те ее элементы, которые
//        принадлежат отрезку [с, d].
package by.epam.jb29.task08_1;

public class Z15 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        int c = 10;
        int d = 30;

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (Math.random() * (50 - (-40))) + (-40);
            System.out.printf("%.3f \t", arr[i]);
        }
        System.out.println();

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] >= c && arr[i] <= d) {
                System.out.printf("%.3f \t", arr[i]);
            }
        }
    }
}
