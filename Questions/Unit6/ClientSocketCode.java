// 1. WAP of Socket to Client. 
import java.net.*;
import java.io.*;

public class ClientSocketCode {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",6666);
            System.out.println("Connected to the Server");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println((String)dis.readUTF());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
