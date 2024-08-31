// Write a Program to Read the Time from the Server.

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DaytimeClient {
    public static void main(String[] args) {
        try {
            // Connect to the time server at time.nist.gov on port 13
            Socket s = new Socket("time.nist.gov", 13);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String time;
            System.out.print("Server Time : ");
            while((time=br.readLine())!=null){
                System.out.print(time);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
