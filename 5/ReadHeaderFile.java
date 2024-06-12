import java.net.*;
public class ReadHeaderFile {
    public static void main(String args[]){
        try{
            URL url = new URL("https://bhandari-santosh.com.np");
            URLConnection uc =url.openConnection();
            for(int i = 1;;i++){
                String header = uc.getHeaderField(i);
                if(header==null){
                    break;
                }
                System.out.println(uc.getHeaderFieldKey(i)+" : "+ header);
            }
        
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
