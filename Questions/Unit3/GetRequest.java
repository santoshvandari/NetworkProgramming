// WAP to communicate with server side program through get.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class GetRequest {
    public static void main(String[] args) {
        String url = "https://bhandari-santosh.com.np";
        try {
            URL u = new URL(url);
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            con.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while(br.readLine()!=null){
                System.out.println(br.readLine());
            }            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
