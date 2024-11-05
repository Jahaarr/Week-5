import java.util.Scanner;

public class NestedExceptionHandlingExample {

    public static void parseAndDivide(String num1, String num2) {
        try {
            // Tente de convertir les chaînes en entiers
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            try {
                // Tente de diviser number1 par number2
                int result = number1 / number2;
                System.out.println("Résultat : " + result);
            } catch (ArithmeticException e) {
                System.out.println("Impossible de diviser par zéro.");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide. Veuillez entrer des nombres valides.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir les deux nombres
        System.out.print("Veuillez entrer le premier nombre : ");
        String num1 = scanner.nextLine();

        System.out.print("Veuillez entrer le deuxième nombre : ");
        String num2 = scanner.nextLine();

        // Appelle la méthode parseAndDivide avec les entrées de l'utilisateur
        parseAndDivide(num1, num2);

        scanner.close();
    }
}
