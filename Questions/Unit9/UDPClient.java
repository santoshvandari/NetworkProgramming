// 1. WAP for UDP Client. 
import java.net.*;
public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data,1024);
            ds.receive(dp);
            String message = new String(dp.getData(),0,dp.getLength());
            System.out.println(message);
            ds.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
