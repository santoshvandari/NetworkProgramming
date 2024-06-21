// 3. WAP that find the canonical host name of the given address.

import java.net.*;
public class CanonicalHostName {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
