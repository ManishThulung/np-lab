// Manish Rai
// 18
package lab1;

import java.net.*;

public class Qn1IPAddressFinder {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("fohss.tu.edu.np");
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println("Could not find IP address for: fohss.tu.edu.np");
        }
    }
}
