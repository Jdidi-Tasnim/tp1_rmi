package tp;

import java.rmi.*;

//Classe client
public class Client {
 public static void main(String[] args) {
     try {
         Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService"); // Récupération de l'objet RMI du serveur
         System.out.println("Connected to server...");

         // Boucle pour effectuer des calculs multiples
         while (true) {
             // Demande à l'utilisateur de saisir l'opération
             System.out.println("Enter operation code (1: Add, 2: Subtract, 3: Multiply, 4: Divide, 5: Quit):");
             int operation = Integer.parseInt(System.console().readLine());

             // Quitter si l'utilisateur le souhaite
             if (operation == 5) {
                 break;
             }

             // Demande à l'utilisateur de saisir les opérandes
             System.out.println("Enter operand 1:");
             double operand1 = Double.parseDouble(System.console().readLine());
             System.out.println("Enter operand 2:");
             double operand2 = Double.parseDouble(System.console().readLine());

             // Appel de la méthode appropriée sur l'objet RMI du serveur
             double result = 0;
             switch (operation) {
                 case 1:
                     result = calculator.add(operand1, operand2);
                     break;
                 case 2:
                     result = calculator.subtract(operand1, operand2);
                     break;
                 case 3:
                     result = calculator.multiply(operand1, operand2);
                     break;
                 case 4:
                     result = calculator.divide(operand1, operand2);
                     break;
                 default:
                     System.out.println("Invalid operation code.");
             }

             // Affichage du résultat
             System.out.println("Result: " + result);
         }

         System.out.println("Disconnected from server.");
     } catch (Exception e) {
         System.err.println("Client exception: " + e.toString());
         e.printStackTrace();
     }
 }
}
