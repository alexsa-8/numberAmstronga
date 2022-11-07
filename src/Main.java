import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.next());
        int num = number;
        int i;
        int n = 0;
        while (num >= 1) {
            i = num % 10;
            num /= 10;
            integers.add(i);
            n++;
        }
        int sum = 0;
        for (Integer j : integers) {
            sum += Math.pow(j, n);
        }
        if (number == sum) {
            System.out.println(number + " является числом Амстронга.");
        } else {
            System.out.println(number + " не является числом Амстронга.");
        }
    }
}