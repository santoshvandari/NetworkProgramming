// Program to find port No. running on server.

import java.net.*;
public class PortRunningInServer{
    public static void main(String[] args) {
        System.out.println("Start Scanning Server....\nOpen Port:");
        for(int port=0;port<=65535;port++){
            try {
                Socket s = new Socket("localhost",port);
                System.out.println(port);
            } catch (Exception ex) {
                // System.out.println(ex);
            }
        }
        System.out.println("Port Scanning Completed.");
    }
    
}
