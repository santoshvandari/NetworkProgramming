// 1. WAP that prints the address of 'www.tufohss.edu.np'.
import java.net.*;
class GetAddress{
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.tufohss.edu.np");
            System.out.println("Address : "+address);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}