import java.net.*;
import java.util.Enumeration;
class TotalInterface{
    public static void main(String args[]){
        try{
            Enumeration<NetworkInterface> ni = NetworkInterface.getNetworkInterfaces();
            while(ni.hasMoreElements()){
                NetworkInterface i = ni.nextElement();
                System.out.println(i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}