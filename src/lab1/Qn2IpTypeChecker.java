// Manish Rai
// 18
package lab1;

import java.net.*;

public class Qn2IpTypeChecker {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("2600:1406:3f::1af1:dc1b");
            byte[] addresstype = address.getAddress();
            if (addresstype.length == 4){
                System.out.println("Address is IPv4");
            }
            else if (addresstype.length == 16){
                System.out.println("Address is IPv6");
            } else {
                System.out.println("Address is not correct");
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not find address");
        }
    }
}