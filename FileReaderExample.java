import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {

    // Méthode pour lire le contenu d'un fichier en utilisant try-with-resources
    public static void readFile(String filename) {
        // try-with-resources pour garantir la fermeture automatique du BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erreur : Fichier non trouvé ou inaccessible.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Création du scanner pour lire l'entrée utilisateur

        // Demande à l'utilisateur de saisir le nom du fichier
        System.out.print("Veuillez entrer le nom du fichier à lire : ");
        String filename = scanner.nextLine();  // Lit le nom du fichier saisi par l'utilisateur

        // Appelle la méthode readFile avec le nom du fichier saisi
        readFile(filename);

        scanner.close();  // Ferme le scanner pour libérer les ressources
    }
}
