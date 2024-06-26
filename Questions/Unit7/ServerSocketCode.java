// 1. WAP of Socket for Server.
import java.net.*;
import java.io.*;

public class ServerSocketCode {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Wait For the Client Connection....");
            Socket s = ss.accept();
            System.out.println("Client Connected");
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Thank you for your Connection");
            s.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
