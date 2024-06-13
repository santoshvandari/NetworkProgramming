// Program to Obtain the Information about the (a)Host (b)Port (c) Protocol

import java.net.*;

public class GetHostAndPort {
    public static void main(String args[]){
        try{
            URL url = new URL("https://bhandari-santosh.com.np:80");
            System.out.println("Host Name is = "+url.getHost());
            System.out.println("Port Number is = "+url.getPort());
            System.out.println("Protocal Used is = "+url.getProtocol());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
