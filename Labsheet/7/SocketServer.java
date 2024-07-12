// 7. Program to create Socket for sending and receiving data.
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class SocketServer{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Waiting for Client Connection....");
            Socket s = ss.accept();
            System.out.println("Client Connected.");
            Scanner sc = new Scanner(System.in);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            while (true) {
                System.out.println("Waiting For Client Message...");
                String client = (String)dis.readUTF();
                System.out.println("Client : "+client);
                System.out.print("Enter a Message(e for Exit): ");
                String server=sc.nextLine();
                if (client.equalsIgnoreCase("e") || server.equalsIgnoreCase("e")){
                    break;
                }
                System.out.println("Server : "+server);
                dos.writeUTF(server);
            }
            s.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
