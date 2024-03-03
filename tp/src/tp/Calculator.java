package tp;

import java.rmi.*;

//Interface de la calculette
interface Calculator extends Remote {
 double add(double x, double y) throws RemoteException;
 double subtract(double x, double y) throws RemoteException;
 double multiply(double x, double y) throws RemoteException;
 double divide(double x, double y) throws RemoteException;
}