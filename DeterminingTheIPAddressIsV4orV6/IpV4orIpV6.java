import java.net.*;
class IpV4orIpV6{
    public static int GetVersion(InetAddress ip){
        byte[] address=ip.getAddress();
        if(address.length==4){
            return 4;
        }else if(address.length==6){
            return 6;
        }else{
            return -1;
        }
    }
    public static void main(String args[]){
        try{

        InetAddress address = InetAddress.getLocalHost();
        InetAddress googleaddress = InetAddress.getByName("www.facebook.com");
        System.out.println("Facebook IP Address : "+googleaddress.getHostAddress());
        String dottedQuad=address.getHostAddress();
        System.out.println("Local Host Address : "+dottedQuad);
        System.out.println("IP Version : "+GetVersion(address));
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}