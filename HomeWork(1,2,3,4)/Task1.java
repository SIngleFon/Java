// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.print("\033\143");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = in.nextInt();
        int count = 1;
        for(int i = 1; i < n; i++){
            count += count * i;
        }
        System.out.println(count);
    }
}
