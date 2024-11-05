import java.util.Scanner;

public class ArithmeticExceptionExample {

    // Méthode pour diviser deux nombres
    public static int divideNumbers(int a, int b) {
        try {
            return a / b;  // Tente de diviser a par b
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro.");  // Gère la division par zéro
            return 0;  // Valeur par défaut si une exception se produit
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crée un objet Scanner pour lire l'entrée utilisateur

        // Demande à l'utilisateur de saisir deux nombres
        System.out.print("Veuillez entrer le premier nombre (a) : ");
        int a = scanner.nextInt();  // Lit le premier nombre

        System.out.print("Veuillez entrer le deuxième nombre (b) : ");
        int b = scanner.nextInt();  // Lit le deuxième nombre

        // Appelle la méthode divideNumbers avec les valeurs saisies et affiche le résultat
        int result = divideNumbers(a, b);
        if (b != 0) {  // Si b n'est pas zéro, on affiche le résultat de la division
            System.out.println("Résultat de la division : " + result);
        }
        
        scanner.close();  // Ferme le scanner pour libérer les ressources
    }
}
