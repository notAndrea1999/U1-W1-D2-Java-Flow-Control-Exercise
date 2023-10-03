import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Inserisci un numero intero tra 1 e 3");
        int number = userInput.nextInt();
        toLetters(number);
        userInput.close();
    }

    public static void toLetters(int n1) {
        switch (n1) {
            case 1: {
                System.out.println("Il numero inserito e' uno");
                break;
            }
            case 2: {
                System.out.println("Il numero inserito e' due");
                break;
            }
            case 3: {
                System.out.println("Il numero inserito e' tre");
                break;
            }
            default: {
                System.out.println("Spiacente il numero inserito e' maggiore di tre");
            }
        }
    }
}
