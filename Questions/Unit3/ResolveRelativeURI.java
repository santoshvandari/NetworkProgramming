// 7. WAP to resolve relative URI.
import java.net.*;
public class ResolveRelativeURI {
    public static void main(String[] args) {
        try {
            URI baseUrl=new URI("https://bhandari-santosh.com.np");
            URI relativeUrl = new URI("/photo.png");
            URI resolvedUrl = baseUrl.resolve(relativeUrl);
            System.out.println(resolvedUrl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
