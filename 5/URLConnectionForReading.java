import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.io.*;


public class URLConnectionForReading {
    public static void main(String args[]){
        try{
            URL u = new URL("https://bhandari-santosh.com.np/");
            URLConnection uc = u.openConnection();
            InputStream raw = uc.getInputStream();
            InputStream buffer = new BufferedInputStream(raw);
            Reader reader = new InputStreamReader(buffer);
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }

        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}
