// Program to Manipulate the IP Address of a System 

import java.net.*;
class InternetAddressOfHost{
    public static void main(String args[]){
        try{
            InetAddress inet = InetAddress.getByName("www.bhandari-santosh.com.np");
            System.out.println("IP of this System = "+inet);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}