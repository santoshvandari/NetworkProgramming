import java.net.*;

public class URLEncoding {
    public static void main(String args[]){
        try{
            String encode = URLEncoder.encode("Hello World in the Universe", "UTF-8");
            System.out.println(encode);
        
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
