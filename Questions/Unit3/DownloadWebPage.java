// 3. WAP to download a webpage of a given web address.
import java.io.*;
import java.net.*;
public class DownloadWebPage {
    public static void main(String[] args) {
        String url ="https://bhandari-santosh.com.np";
        try {
            URL u = new URL(url);
            BufferedReader bf = new BufferedReader(new InputStreamReader(u.openStream()));
            while(bf.readLine()!=null){
                System.out.println(bf.readLine());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
