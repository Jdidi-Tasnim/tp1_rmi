package tp;

import java.rmi.*;

// Classe serveur
public class Server {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl(); // Création d'une instance de la calculatrice
            Naming.rebind("CalculatorService", calculator); // Publication de l'objet RMI
            System.out.println("Server is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
