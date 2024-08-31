// Client Program that Access MultiThreadeddayTimeServer

import java.io.DataInputStream;
import java.net.Socket;
public class DayTimeClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",6666);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String time = dis.readUTF();
            System.out.println(time);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
