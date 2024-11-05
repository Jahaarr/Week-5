import java.util.Scanner;

// Définition de l'exception personnalisée
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidationExample {

    // Méthode pour vérifier l'âge et lancer une exception si l'âge est inférieur à 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("L'âge doit être de 18 ans ou plus.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crée un scanner pour lire l'entrée utilisateur

        // Demande à l'utilisateur de saisir un âge
        System.out.print("Veuillez entrer votre âge : ");
        int age = scanner.nextInt();  // Lit l'âge saisi par l'utilisateur

        try {
            checkAge(age);  // Vérifie si l'âge est valide
            System.out.println("Accès autorisé.");  // Si l'âge est valide
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());  // Affiche le message d'erreur si l'âge est invalide
        }

        scanner.close();  // Ferme le scanner pour libérer les ressources
    }
}
