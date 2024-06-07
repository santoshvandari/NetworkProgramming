import java.net.*;
public class URIChecking {
    public static void main(String args[]){
        try{
            URI u = new URI("tel:+1-8-222222");
            System.out.println(u.getFragment());
            System.out.println(u.getPath());
            System.out.println(u.getScheme());
            System.out.println(u.getHost());
            System.out.println(u.getQuery());

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
