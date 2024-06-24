// 12. WAP that demonstrate the Spam Check.

import java.net.*;
public class SpamCheckIP {
    private static boolean CheckSpam(String ip){
        try {
            InetAddress address = InetAddress.getByName(ip);
            byte[] add = address.getAddress();
            String query = "sbl.spamhaus.org";
            for(byte octet : add){
                int unsignedByte = octet<0 ? octet+256 : octet;
                query=unsignedByte+"."+query;
            }
            System.out.println(query);
            InetAddress.getByName(query);
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        if(CheckSpam(ip)){
            System.out.println(ip + " is a Spam IP.");
        }else{
            System.out.println(ip + " is not found Spam IP List.");
        }
    }

}
