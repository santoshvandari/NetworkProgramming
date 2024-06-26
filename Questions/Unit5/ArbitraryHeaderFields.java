// 3. WAP to print entire HTTP Headers.

import java.net.*;
class ArbitraryHeaderFields{
    public static void main(String[] args) {
        try {
            URL url = new URL("https://bhandari-santosh.com.np");
            URLConnection con = url.openConnection();
            for(int i =1; ; i++){
                if(con.getHeaderField(i)==null)
                    break;
                System.out.println(con.getHeaderFieldKey(i)+ " : "+con.getHeaderField(i));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}