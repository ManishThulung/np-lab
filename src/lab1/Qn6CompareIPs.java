// Manish Rai
// 18
package lab1;

import java.net.*;

public class Qn6CompareIPs {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getByName("tu.edu.np");
            InetAddress address2 = InetAddress.getByName("fohss.tu.edu.np");
            if (address1.getHostAddress().equals(address2.getHostAddress())) {
                System.out.println("Addresses are the same");
            } else {
                System.out.println("Addresses are different");
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not resolve hostnames");
        }
    }
}
