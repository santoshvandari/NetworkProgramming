// WAP for the UPD Server.
import java.net.*;
public class UPDServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String str = "Welcome Java";
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
            ds.send(dp);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
