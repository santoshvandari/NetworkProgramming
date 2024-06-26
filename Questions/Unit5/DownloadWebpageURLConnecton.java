// 1. WAP to download a Webpage using URL Connection. 
import java.io.*;
import java.net.*;

public class DownloadWebpageURLConnecton {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://bhandari-santosh.com.np/");
            URLConnection con = url.openConnection();
            InputStream data = con.getInputStream();
            int res;
            while((res=data.read())!=-1){
                System.out.print((char) res);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
