// Write a Program to Get Remote and Local Socket Address

import java.net.*;
public class RemoteAndLocalSocketAddress {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",6666);
            System.out.println("Local socket address: " + s.getLocalSocketAddress());
            System.out.println("Remote socket address: " + s.getRemoteSocketAddress());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
