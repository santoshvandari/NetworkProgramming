// Program to find port No. running on server.

import java.net.*;
public class PortRunningInServer{
    public static void main(String[] args) {
        System.out.println("Start Scanning Server....\nOpen Port:");
        for(int i=0;i<=65535;i++){
            try {
                Socket s = new Socket("163.70.138.35",i);
                System.out.println(i);
            } catch (Exception ex) {
                // System.out.println(ex);
            }
        }
        System.out.println("Port Scanning Completed.");
    }
    
}
