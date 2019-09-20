//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
package by.epam.jb29.task08_1;

public class Z2 {
    public static void main(String[] args) {
        int [] arr = {0, 5, 0, 6, 8, 0, 4, 0};
        int size = 0;
        int [] nul;
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                size++;
            }
        }

        nul = new int [size];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                nul[index] = i;
                index++;
            }
        }

        for (int i = 0; i < nul.length; i++) {
            System.out.print(nul[i] + "\t");
        }
    }
}

