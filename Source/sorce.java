package Source;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class sorce {

    public static int[] randomFillArrayInt() {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        String[] Array = { "Введите кол-во элементов в массиве: ", "Введите минимальное значение в массиве: ",
                "Введите максимальное значение в массиве: " };
        int[] intArr = new int[3];
        for (int index = 0; index < Array.length; index++) {
            System.out.print(Array[index]);
            intArr[index] = in.nextInt();
        }
        int[] retArr = new int[intArr[0]];
        for (int index = 0; index < intArr[0]; index++) {
            retArr[index] = r.nextInt(intArr[1], intArr[2]);
        }
        return retArr;
    }

    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void printIntArray(int[] args) {
        System.out.println(Arrays.toString(args));
    }
    
}
