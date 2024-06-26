// 5. WAP to print URL of a URL Connection to "tufohss.edu.np".
import java.net.*;
public class PrintURLOfURLConnection {
    public static void main(String[] args) {
        String url = "https://tufohss.edu.np";
        try {
            URL u = new URL(url);
            System.out.println("URL : "+u);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
