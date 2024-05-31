import java.net.*;
import java.io.*;
import java.util.Scanner;
class ServerCode{
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(9999);
            Scanner sc = new Scanner(System.in);
            String servermsg,clientmsg;
            System.out.println("Waiting For Client Connection....");
            Socket s = ss.accept();
            System.out.println("Client Connected.");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            while(true){
                System.out.println("Waiting Client Message......");
                clientmsg = (String) dis.readUTF();
                System.out.println("Client : "+clientmsg);
                System.out.print("Enter a Message(e for Exit): ");
                servermsg=sc.nextLine();
                if (servermsg=="E" || servermsg=="e"){
                    break;
                }
                System.out.println("Server : "+servermsg);
                dos.writeUTF(servermsg);
            }
            dos.flush();
            dos.close();
            s.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}