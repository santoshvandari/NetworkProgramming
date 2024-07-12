// 2. WAP for UDP Server.
import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String str = "Welcome Java";
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
            ds.send(dp);
            ds.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
