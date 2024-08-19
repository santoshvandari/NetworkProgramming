// PRogram to List the Network Interface of the System

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkInterfaceList{
    public static void main(String[] args) {
        try{
            Enumeration<NetworkInterface> networkinterface = NetworkInterface.getNetworkInterfaces();
            while(networkinterface.hasMoreElements()){
                NetworkInterface ni = networkinterface.nextElement();
                System.out.println(ni);
                System.out.println(ni.getDisplayName());
            }

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}