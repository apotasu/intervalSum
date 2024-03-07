import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o limite do intervalo");
        int num = scn.nextInt();
        System.out.println(interval(num) + " sequências de valores somam exatamente " + num);
    }

    public static int interval(int num) {
        int total = 1;
        for (int i = 1; i < num; i++) {
            if (soma(i)) {
                total++;
            }
        }
        return total;
    }

    public static boolean soma(int n) {
        int soma = 0;
        for (int i = n; i <= 15; i++) {
            if (i + soma == 15) {
                return true;
            } else {
                soma += i;
            }
        }
        return false;
    }
}