import java.net.*;
class UDPPortScan{
    public static void main(String[] args) {
        for(int port = 1; port <= 65535; port++){
                try{
                DatagramSocket Server = new DatagramSocket(port);
                Server.close();
                
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
}