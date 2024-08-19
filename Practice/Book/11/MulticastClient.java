import java.net.*;
public class MulticastClient {
    public static void main(String[] args) {
        try{
            MulticastSocket ms = new MulticastSocket(8888);
            InetAddress multicastgroup = InetAddress.getByName("224.0.0.1");

            // Join the multicast group
            ms.joinGroup(multicastgroup);

            System.out.println("Joined Multicast Group: " + multicastgroup.getHostAddress());

            byte[] buffer = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

            while (true) {
                ms.receive(dp);
                String msg = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Received Message: " + msg);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
