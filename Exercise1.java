import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Digita un numero intero");
//        int number1 = userInput.nextInt();
//        userInput.close();
//        System.out.println(evenOrOdd(number1));

        Scanner input = new Scanner(System.in);
        System.out.println("Digita un anno");
        int number2 = input.nextInt();
        System.out.println(leapYear(number2));
        input.close();
    }

    public static boolean evenOrOdd(int n1) {
        if (n1 % 2 == 0) {
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
