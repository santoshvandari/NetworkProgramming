import java.net.*;

public class URLDecoding {
    public static void main(String args[]){
        try{
            String encode = URLDecoder.decode("Hello+Wrold+in+the+universe", "UTF-8");
            System.out.println(encode);
             
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
