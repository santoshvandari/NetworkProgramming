// Write  a Program to Retrieve IP and MAC address.

import java.net.InetAddress;
import java.net.NetworkInterface;

public class RetriveIPandMacAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP Address : "+address.getHostAddress());
            NetworkInterface ni = NetworkInterface.getByInetAddress(address);
            System.out.println("MAC Address : "+ni.getHardwareAddress());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
