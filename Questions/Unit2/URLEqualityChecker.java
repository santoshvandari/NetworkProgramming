// 8. WAP that compares the domain names 'www.ibiblio.org' and 'helios.ibiblio.org'.
import java.net.*;
public class URLEqualityChecker {
    public static void main(String[] args) {
        try {
            URL url1=new URL("http://www.ibiblio.org");
            URL url2=new URL("https://helios.ibiblio.org");
            if(url1.equals(url2)){
                System.out.println("Both are Equals");
            }else{
                System.out.println("URL are not Equals");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}


