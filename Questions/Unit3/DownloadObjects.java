// 4. WAP to download an objects.
import java.net.*;
import java.io.*;
public class DownloadObjects {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8080/Readme.md";
        String filename="readme.md";
        try {
            URL u = new URL(url);
            BufferedInputStream bis=new BufferedInputStream(u.openStream());
            FileOutputStream fos = new FileOutputStream(filename);
            byte[] b = new byte[1024];
            int i;
            while((i=bis.read(b,0,1024))!=-1){
                fos.write(b,0,i);
            }
        } catch (Exception ex ) {
            System.out.println(ex);            
        }
    }
}
