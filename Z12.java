//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//        являются простыми числами.
package by.epam.jb29.task08_1;

public class Z12 {
    public static void main(String[] args) {
        double [] arr = new double[30];
        double sum = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (50 - (-40))) + (-40);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    flag = true;
                    break;
                }
                else {
                    flag = false;
                }
            }
            if (!flag){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
