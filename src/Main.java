public class Main {
    public static void main(String[] args) {
        System.out.println(interval());
    }

    public static int interval() {
        int total = 1;
        for (int i = 1; i<15; i++){
            if (soma(i)){
                total++;
            }
        }
        return total;
    }
    public static boolean soma(int n){
        int soma = 0;
        for (int i = n; i <= 15; i++){
            if (i + soma == 15) {
                return true;
            } else {
                soma += i;
            }
        }
        return false;
    }
}