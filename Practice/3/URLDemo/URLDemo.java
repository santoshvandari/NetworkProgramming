import java.net.*;
class URLDemo{
    public static void main(String args[]){
        try{
           URL u = new URL("ftp://google.com");
            System.out.println(u.getProtocol()+" is Supported");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}