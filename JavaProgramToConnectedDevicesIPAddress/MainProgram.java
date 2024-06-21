// Program to get Connected Devices IP address of a Same Network.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.net.InetAddress;
import java.net.NetworkInterface;

public class MainProgram {
    static String interfaceName="wlp0s20f3";
    public static void main(String[] args) {
        String subnet = getSubnet();
        int timeout = 1000;  // 1 second timeout for each ping
        List<String> devices = new ArrayList<>();

        for (int i = 1; i < 255; i++) {  // Scanning IP addresses from 1 to 254
            String host = subnet + i;
            try {
                InetAddress inetAddress = InetAddress.getByName(host);
                if (inetAddress.isReachable(timeout)) {
                    String macAddress = getMacAddress(host);
                    String deviceName= inetAddress.getHostName();
                    String deviceInfo = "IP: " + host + ", MAC: " + macAddress + ", Device Name: " + deviceName;
                    devices.add(deviceInfo);
                    System.out.println(deviceInfo);
                }
            } catch (IOException e) {
                System.err.println("IOException for IP: " + host);
            }
        }

        System.out.println("Connected devices:");
        for (String device : devices) {
            System.out.println(device);
        }
    }

    private static String getSubnet(){
        try {
            NetworkInterface networkInterface = NetworkInterface.getByName(interfaceName);
            if (networkInterface != null) {
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress() && inetAddress.isSiteLocalAddress()) {
                        // remove the last part of the IP address
                        String ipaddress = inetAddress.getHostAddress();
                        String[] tokens = ipaddress.split("\\.");
                        return tokens[0] + "." + tokens[1] + "." + tokens[2] + ".";
                    }
                }
            } else {
                System.err.println("Network interface " + interfaceName + " not found.");
                return "127.0.0.1";
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        return "127.0.0.1";

    }

    private static String getMacAddress(String ip) {
        String macAddress = "Unknown";
        try {
            ProcessBuilder pb = new ProcessBuilder("arp", "-n", ip);
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(ip)) {
                    String[] tokens = line.split("\\s+");
                    if (tokens.length >= 4) {
                        macAddress = tokens[2];
                    }
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("IOException while getting MAC address for IP: " + ip);
        }
        return macAddress;
    }
}
