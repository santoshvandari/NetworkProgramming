// 7. Program to create Socket for sending and receiving data.
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ScoketClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",6666);
            System.out.println("Connected To Server.");
            Scanner sc = new Scanner(System.in);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            while(true){
                System.out.print("Enter a Message(e for Exit): ");
                String client = sc.nextLine();
                if (client.equalsIgnoreCase("e")){
                    break;
                }
                dos.writeUTF(client);
                System.out.println("Waiting Server Message......");
                String server=(String)dis.readUTF();
                System.out.println("Server : "+ server);
            }
            s.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
