import java.net.*;

public class MulticastServer {
    public static void main(String[] args) {
        try{
            MulticastSocket ms = new MulticastSocket();
            InetAddress group = InetAddress.getByName("224.0.0.1");
               
            String message = "Hello Multicast";
            byte[] data = message.getBytes();
            DatagramPacket dp = new DatagramPacket(data, data.length, group, 8888);
            ms.send(dp);
            System.out.println("Multicast Message Sent");

                // Sleep for a while before sending the next message
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
