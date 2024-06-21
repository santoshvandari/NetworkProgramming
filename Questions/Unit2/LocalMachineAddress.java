// 2. WAP that finds the address of local machine.

import java.net.*;

public class LocalMachineAddress {
   public static void main(String[] args) {
    try{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Address : "+address);
    }catch(Exception ex){
        System.out.println(ex);
    }
   } 
}
