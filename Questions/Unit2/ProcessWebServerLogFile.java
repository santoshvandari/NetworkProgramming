// 13. WAP to process Web Server log file. 
import java.io.*;
import java.net.*;
public class ProcessWebServerLogFile {
    public static void main(String[] args) {
        String file="logfiles.txt";
        try{
            FileInputStream fin = new FileInputStream(file);
            Reader in = new InputStreamReader(fin);
            BufferedReader bin = new BufferedReader(in);
            while(bin.readLine()!=null) {
                // separate out the IP address
                String entry = bin.readLine();
                int index = entry.indexOf(' ');
                String ip = entry.substring(0, index);
                String theRest = entry.substring(index);
                // Ask DNS for the hostname and print it out
                try {
                    InetAddress address = InetAddress.getByName(ip);
                    System.out.println(address.getHostName()+ theRest);
                } catch (UnknownHostException ex) {
                    System.out.println(ex);
                }
            }
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}