// MultiThreadedDayTimeServer Program 
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

class DateTimeServer implements Runnable {
    private Socket clientSocket;
    public DateTimeServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    public void run() {
        try {
            String date = new Date().toString();
            DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
            dos.writeUTF(date);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
public class MultiThreadedDayTimeServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server started and listening on port 5000...");
            while (true) {
                Socket s = ss.accept();
                System.out.println("Client connected: " + s.getInetAddress());
                DateTimeServer dateTimeServer = new DateTimeServer(s);
                Thread thread = new Thread(dateTimeServer);
                thread.start();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
