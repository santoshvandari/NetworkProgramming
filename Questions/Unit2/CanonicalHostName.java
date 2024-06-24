// 3. WAP that find the canonical host name of the given address.

import java.net.*;
public class CanonicalHostName {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println(address.getCanonicalHostName());
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
