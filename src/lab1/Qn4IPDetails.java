// Manish Rai
// 18
package lab1;

import java.net.*;

public class Qn4IPDetails {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("8.8.8.8");
            System.out.println("Canonical name of the IP address: " + address.getCanonicalHostName());
            System.out.println("Host name of the IP address: " + address.getHostName());
        } catch (UnknownHostException ex) {
            System.out.println("Could not find IP address");
        }
    }
}
