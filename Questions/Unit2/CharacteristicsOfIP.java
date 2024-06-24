import java.net.*;
public class CharacteristicsOfIP {
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        try{
            InetAddress address = InetAddress.getByName(ip);
            if(address.isLoopbackAddress()){
                System.out.println(address + " is Loopback Address");
            }
            if (address.isAnyLocalAddress()) {
                System.out.println(address + " is Wildcard Address");
            }
            if (address.isSiteLocalAddress()) {
                System.out.println(address + " is a Site Local Address");
            }
            if(address.isLinkLocalAddress()){
                System.out.println(address + " is a Link Local Address");
            }
            if (address.isMulticastAddress()) {
                System.out.println(address + " is Multicast Address");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
