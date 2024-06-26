// 6. WAP to get a time when a URI was last change. 
import java.net.*;
public class LastChangeURI {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://bhandari-santosh.com.np");
            URLConnection con = url.openConnection();
            System.out.println("Last Modified Date : "+con.getLastModified());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
