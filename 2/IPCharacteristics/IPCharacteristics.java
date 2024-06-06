import java.net.*;
class IPCharacteristics{
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("www.facebook.com");
            System.out.println(address);

            if(address.isAnyLocalAddress()){
                System.out.println(address + " is a wildcard Address.");
            }

            if(address.isLoopbackAddress()){
                System.out.println(address + " is a Loopback Address.");
            }

            if(address.isLinkLocalAddress()){
                System.out.println(address + " is a Link Local Address.");
            }else if(address.isSiteLocalAddress()){
                System.out.println(address + " is a site-local Address.");
            }else{
                System.out.println(address + " is a global Address");
            }

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}