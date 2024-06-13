// Program to Manipulate the IP Address of a System 
import java.net.*;

public class ManipulateIPAddress {
    public static void main(String args[]){
        try{
           InetAddress inet = InetAddress.getLocalHost();
           System.out.println("IP of the System = "+ inet.getHostAddress());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
