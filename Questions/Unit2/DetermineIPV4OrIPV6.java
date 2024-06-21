// 6. WAP for determining whether an IP Address is IPV4 or IPV6.

import java.net.*;

public class DetermineIPV4OrIPV6 {
    public static void main(String[] args) {
        try {
            String ip = "127.0.0.1";
            if(ip.contains(".")){
                System.out.println(ip+" is IPV4.");
            }
            if(ip.contains(":")){
                System.out.println(ip+" is IPV6.");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
