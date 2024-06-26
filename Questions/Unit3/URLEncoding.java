// 5. WAP to demonstrate x-www-form-urlencoded String. 
import java.net.*;
public class URLEncoding {
    public static void main(String[] args) {
        String data = "?query=data1 & data2";
        try {
            String encodeData = URLEncoder.encode(data,"UTF-8");
            System.out.println("Encoded Data : "+encodeData);
            String decodedData = URLDecoder.decode(encodeData,"UTF-8");
            System.out.println("Decoded Data : "+decodedData);
        } catch (Exception ex ) {
            System.out.println(ex);
        }
    }
}
