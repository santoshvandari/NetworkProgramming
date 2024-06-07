import java.net.*;
import java.io.*;
class DownloadObject{
    public static void main(String args[]){
        try{
            // URL u = new URL("http://www.google.com");
            URL u = new URL("http://www.google.com/search?q=china");
            System.out.println(u.getProtocol());
            System.out.println(u.getContent());
            System.out.println(u.getHost());
            System.out.println(u.getQuery());
            Object o = u.getContent();
            System.out.println("O gpt a "+o.getClass().getName());
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}