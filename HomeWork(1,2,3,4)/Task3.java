// Реализовать простой калькулятор
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        Scanner in = new Scanner(System.in);
        System.out.println("Пример вводится через пробел.\nДопустимые операции: '*' '/' '+' '-' '%'");
        System.out.print("Введите пример: ");
        String[] UserKey = in.nextLine().split(" ");
        int result = 0;
        switch (UserKey[1]){
        case "+":
            result = Integer.parseInt(UserKey[0]) + Integer.parseInt(UserKey[2]);
            break;
        case "-":
            result = Integer.parseInt(UserKey[0]) - Integer.parseInt(UserKey[2]);
            break;
        case "/":
            result = Integer.parseInt(UserKey[0]) / Integer.parseInt(UserKey[2]); 
            break;
        case "*":
            result = Integer.parseInt(UserKey[0]) * Integer.parseInt(UserKey[2]);
            break;
        case "%":
            result = Integer.parseInt(UserKey[0]) % Integer.parseInt(UserKey[2]);
        }
        System.out.printf("%d %c %d = %d", Integer.parseInt(UserKey[0]), UserKey[1].charAt(0), Integer.parseInt(UserKey[2]), result);

    }
}
