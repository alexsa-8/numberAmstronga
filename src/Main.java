import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int num = 153;
        int number = num;
        int i;
        int n = 0;
        while (number >= 1) {
            i = number % 10;
            number /= 10;
            integers.add(i);
            n++;
        }
        int sum = 0;
        for (Integer j : integers) {
            sum += Math.pow(j, n);
        }
        System.out.println(sum);
        if (num == sum) {
            System.out.println(num + " является числом Амстронга.");
        } else {
            System.out.println(num + " не является числом Амстронга.");
        }
    }
}