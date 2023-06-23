// Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        System.out.print("\033\143");
        Scanner in = new Scanner(System.in);
        for (int i = 2; i <= 1000; i++) {
                for (int j = 2; j <= i; j++) {
                    if (j < i  & i % j == 0) {
                        break;
                    }
                    if (i % j == 0) {
                        System.out.println(i);
                    }
                }
            }
}
}
