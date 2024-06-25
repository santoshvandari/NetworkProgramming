// 2. WAP that check which protocol does a virtual machine support or not.
import java.net.*;
public class CheckProtocol {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://google.com");
            System.out.println("Protocol : "+url.getProtocol());
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
