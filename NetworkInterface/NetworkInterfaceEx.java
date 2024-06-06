import java.net.*;
class NetworkInterfaceEx{
    public static void main(String args[]){
        try{
            InetAddress local = InetAddress.getByName("30.30.28.31");
            NetworkInterface ni = NetworkInterface.getByInetAddress(local);
            System.out.println(ni);
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}