// Program to Access daytime service from server using Socket.

import java.net.*;
import java.io.*;

public class AccessDateTime {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("time.nist.gov" , 13);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int line;
            while ((line = br.read()) != -1) {
                System.out.print((char) line);
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}