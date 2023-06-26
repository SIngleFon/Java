// (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Task4 {
    public static int[] test(String[] UserKey, int ind) {
        int find = find_index(UserKey, ind);
        String x = UserKey[ind];
        String[] array = new String[x.length()];
        char[] ar = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            array[i] = String.valueOf(ar[i]);
        }
        int[] result = new int[10];
        if (find == -1){
            int[] res = new int[1];
            res[0] = Integer.parseInt(UserKey[ind]);
            return res;
        }
        if (find == 1) {
            for (int j = 0; j < 10; j++) {
                int s = Integer.parseInt(array[0]);
                String giga = String.valueOf(s) + String.valueOf(j);
                int res = Integer.parseInt(giga);
                result[j] = res;

            }
            return result;
        } else {
            for (int j = 0; j < 10; j++) {
                int s = Integer.parseInt(array[1]);
                String giga = String.valueOf(j) + String.valueOf(s);
                int res = Integer.parseInt(giga);
                result[j] = res;
            }
            return result;
        }

    }

    public static int find_index(String[] arr, int s) {
        String x = arr[s];
        char[] array = x.toCharArray();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == '?') {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("\033\143");
        Scanner in = new Scanner(System.in);
        System.out.println("Вводи пример полностью!\n'xxx + xxx = xxx'");
        System.out.print("Ввод:");
        String[] UserKey = in.nextLine().split("\s*[+=]\s*");
        int[] arr = test(UserKey, 0);
        int[] arr1 = test(UserKey, 1);
        System.out.println(arr[0]);
        boolean flag = false;
        int x1 = 0;
        int y1 = 0;
        for (int i : arr) {
            int result = 0;
            for (int j : arr1) {
                result = i + j;
                if (result == Integer.parseInt(UserKey[2])) {
                    x1 = i;
                    y1 = j;
                    flag = true;
                    break;
                }
            }
        }
        System.out.printf(flag ? "Пример: %d + %d = %d" : "К сожалению ответа нет", x1, y1,
                Integer.parseInt(UserKey[2]));
    }
}
