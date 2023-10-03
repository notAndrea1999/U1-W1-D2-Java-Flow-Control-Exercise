import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digita una parola a tuo piacimento");
        String string1 = userInput.nextLine();
        System.out.println(evenOrOdd(string1));
        System.out.println("Digita un anno");
        int number2 = userInput.nextInt();
        System.out.println(leapYear(number2));
        userInput.close();

        
    }

    public static boolean evenOrOdd(String s1) {
        if (s1.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYear(int n1) {

        if ((n1 % 4 == 0 && n1 % 100 != 0) || (n1 % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

}
