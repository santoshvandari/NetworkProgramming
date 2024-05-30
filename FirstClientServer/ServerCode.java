import java.net.*;
import java.io.*;
class ServerCode{
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String message = (String)dis.readUTF();
            System.out.println("Message : "+message);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}