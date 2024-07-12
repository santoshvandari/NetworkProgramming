// 6. Program to read the source Code of the web  page.

import java.io.InputStream;
import java.net.*;
public class ReadWebPageSourceCode {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://bhandari-santosh.com.np/");
            URLConnection con = url.openConnection();
            InputStream sourcecode = con.getInputStream();
            int code;
            while((code=sourcecode.read())!=-1){
                System.out.print((char)code);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
