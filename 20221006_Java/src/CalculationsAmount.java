import java.util.Scanner;
public class CalculationsAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int x = 0;
        while (x < 3) {
            int res = amount * 10 / 100;
            amount = amount - res;
            x++;

        }
        System.out.println(amount);
    }

}
