// 1. WAP that split the part of URL.


import java.net.*;
public class SplitURLPart {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.facebook.com/login");
            System.out.println("Protocol : "+url.getProtocol());
            System.out.println("Host : "+url.getHost());
            System.out.println("Port : "+url.getDefaultPort());
            System.out.println("Path : "+url.getPath());
            System.out.println("Query : "+url.getQuery());
            System.out.println("Fragment : "+url.getRef());

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
