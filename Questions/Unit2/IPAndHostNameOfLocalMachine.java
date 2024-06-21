// 4. WAP to find the IP Address and Host Name of a local machine. 

import java.net.*;

public class IPAndHostNameOfLocalMachine {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP Address : "+address.getHostAddress());
            System.out.println("Host Name : "+address.getHostName());
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
