import java.net.*;
public class URIRelative {
    public static void main(String args[]){
        try{
            URI abs=new URI("https://google.com/");
            URI rel = new URI("images/logo.png");
            URI resolved = abs.resolve(rel);
            System.out.println(resolved);

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
