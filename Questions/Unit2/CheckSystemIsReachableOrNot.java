// 11. WAP to check remote system is reachable or not.
import java.net.*;
public class CheckSystemIsReachableOrNot {
    public static void main(String[] args) {

        try {
            InetAddress address = InetAddress.getByName("www.facebook.com");
            if(address.isReachable(500)){
                System.out.println(address + " is Reachable.");
            }else{
                System.out.println(address + " is not Reachable.");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
