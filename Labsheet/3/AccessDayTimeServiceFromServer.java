// Program to Access daytime service from server using Socket.



// import java.net.*;
// public class AccessDayTimeServiceFromServer {
//     public static void main(String[] args) {
//         try{

//             DatagramSocket socket = new DatagramSocket(args.length == 0 ? DEFAULT_PORT : Integer.parseInt(args[0]));
//             DatagramPacket packet = new DatagramPacket(new byte[1], 1);
    
//             while (true) {
//                 socket.receive(packet);
//                 System.out.println("Received from: " + packet.getAddress() + ":" + packet.getPort());
//                 byte[] outBuffer = new java.util.Date().toString().getBytes("latin1");
//                 packet.setData(outBuffer);
//                 packet.setLength(outBuffer.length);
//                 socket.send(packet);
//             }
//         }catch(Exception ex){
//             System.out.println(ex);
//         }
        
//     }
// }