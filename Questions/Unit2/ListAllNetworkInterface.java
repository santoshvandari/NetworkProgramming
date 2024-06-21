// 9. WAP that list all the network interface.

import java.net.*;
import java.util.ArrayList;
import java.util.Enumeration;

public class ListAllNetworkInterface {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> inet = NetworkInterface.getNetworkInterfaces();
            while (inet.hasMoreElements()){
                NetworkInterface i = inet.nextElement();
                System.out.println(i);
                
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
