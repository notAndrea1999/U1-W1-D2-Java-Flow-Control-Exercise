import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una numero intero");
        int numero = input.nextInt();
        countDown(numero);
        input.close();
    }

    public static void countDown(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}


