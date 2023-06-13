// Manish Rai
// 18
package lab1;

import java.net.*;
import java.util.*;

public class Qn7ListNetworkAdapters {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            System.out.println("List of network adapters:");
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Name: " + ni.getName() + ", Display name: " + ni.getDisplayName());
            }
        } catch (SocketException ex) {
            System.out.println("Could not retrieve network interfaces");
        }
    }
}

