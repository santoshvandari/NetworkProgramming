// package Practice.12.DemoProgram;


import java.rmi.*;
import java.rmi.registry.*;
public class RMIServer{
    public static void main(String args[]){
        try{
            RMIInterfaceImplementation locobj = new RMIInterfaceImplementation();
            Registry rgsty = LocateRegistry.createRegistry(1888);
            rgsty.rebind("localhost", locobj);
            }catch(RemoteException re){System.out.println(re);
        }
    }
}