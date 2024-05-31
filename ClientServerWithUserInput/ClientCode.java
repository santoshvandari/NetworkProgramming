import java.net.*;
import java.io.*;
import java.util.Scanner;
class ClientCode{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",9999);
            Scanner sc = new Scanner(System.in);
            String clientmsg,servermsg;
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println("Connected to the Server.");
            while(true){
                System.out.print("Enter a Message(e for Exit): ");
                clientmsg = sc.nextLine();
                if (clientmsg=="E" || clientmsg == "e"){
                    break;
                }
                dos.writeUTF(clientmsg);
                System.out.println("Waiting Server Message......");
                servermsg=(String)dis.readUTF();
                System.out.println("Server : "+ servermsg);
            }
            dos.flush();
            dos.close();
            s.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}