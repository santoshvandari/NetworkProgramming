import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionAlive {
    public static void main(String[] args){
        try{

            URL url = new URL("http://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Connection", "keep-alive");
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            // Check if Keep-Alive is enabled
            String connectionHeader = connection.getHeaderField("Connection");
            if ("keep-alive".equalsIgnoreCase(connectionHeader)) {
                System.out.println("Keep-Alive is enabled.");
            } else {
                System.out.println("Keep-Alive is not enabled.");
            }
            connection.disconnect();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}