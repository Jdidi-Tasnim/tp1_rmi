package tp;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


// Implémentation de l'interface Calculator
public class CalculatorImpl extends UnicastRemoteObject implements tp.Calculator {
    public CalculatorImpl() throws RemoteException {
        super();
    }

    // Implémentation des opérations
    public double add(double x, double y) throws RemoteException {
        return x + y;
    }

    public double subtract(double x, double y) throws RemoteException {
        return x - y;
    }

    public double multiply(double x, double y) throws RemoteException {
        return x * y;
    }

    public double divide(double x, double y) throws RemoteException {
        if (y == 0) {
            throw new RemoteException("Cannot divide by zero");
        }
        return x / y;
    }
}
