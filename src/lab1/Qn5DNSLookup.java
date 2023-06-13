// Manish Rai
// 18
package lab1;

import java.net.*;

public class Qn5DNSLookup {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("dns.google.com");
            System.out.println("Addresses of dns.google.com:");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not find dns.google.com");
        }
    }
}

