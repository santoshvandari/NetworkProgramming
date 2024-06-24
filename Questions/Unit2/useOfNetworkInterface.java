// 10. WAP to use of Network Interface using getter method
import java.net.*;
import java.util.Enumeration;
public class useOfNetworkInterface {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> inet = NetworkInterface.getNetworkInterfaces();
            NetworkInterface iface = inet.nextElement();
            System.out.println(iface.getDisplayName());
            System.out.println(iface.getHardwareAddress());
            System.out.println(iface.getIndex());
            System.out.println(iface.getMTU());
            System.out.println(iface.hashCode());
            System.out.println(iface.isLoopback());
            System.out.println(iface.isUp());
            System.out.println(iface.isPointToPoint());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
