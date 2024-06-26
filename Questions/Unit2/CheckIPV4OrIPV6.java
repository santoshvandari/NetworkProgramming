// 5. WAP to get IP Address of IPV4 & IPV6 of a given Web Address.
import java.net.*;
public class CheckIPV4OrIPV6 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
            String ip=address.getHostAddress();
            System.out.println("IP Address : "+ip);
            if(address instanceof Inet4Address){
                System.out.println(ip+" is IPV4 Address");
            }
            if(address instanceof Inet6Address){
                System.out.println(ip+" is IPV6 Address");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }        
    }
    
}
