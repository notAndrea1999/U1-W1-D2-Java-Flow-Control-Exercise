import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String parola = input.nextLine();
        toChar(parola);
        input.close();
    }

    public static void toChar(String string) {
        int i = 0;
        if (string.length() == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("DEVI INSERIRE UNA PAROLA");
            String parola = input.nextLine();
            toChar(parola);
            input.close();
        }
        while (i < string.length()) {
            String character = String.valueOf(string.charAt(i));

            if (character.equals("q")) {
                break;
            } else {
                System.out.println(character + ",");
                i++;
            }


        }
    }
}
