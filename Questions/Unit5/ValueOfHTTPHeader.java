// 2. WAP to read the Value of HTTP Header Fields. 
import java.net.*;
public class ValueOfHTTPHeader {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://bhandari-santosh.com.np");
            URLConnection con = u.openConnection();
            System.out.println("Content Type : "+con.getContentType());
            System.out.println("Content Length : "+con.getContentLength());
            System.out.println("Content Encoding : "+con.getContentEncoding());
            System.out.println("Document Sent : "+con.getDate());
            System.out.println("Last Modified : "+con.getLastModified());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
