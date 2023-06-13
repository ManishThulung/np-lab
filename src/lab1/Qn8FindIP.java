// Manish Rai
// 18
package lab1;

import java.net.*;
import java.net.Inet6Address;

public class Qn8FindIP {
    public static void main(String[] args) {
//        try {
//            InetAddress address4 = InetAddress.getByName("www.apple.com");
////            Inet6Address address6 = (Inet6Address) Inet6Address.getByName("www.apple.com");
////            if (address instanceof Inet4Address) {
//            System.out.println("IPv4 address: " + address4.getHostAddress());
////            } else if (address instanceof Inet6Address) {
////                System.out.println("IPv6 address: " + address6.getHostAddress());
////            }
//            InetAddress[] inetAddresses = InetAddress.getAllByName("www.apple.com");
//            for (InetAddress inetAddress : inetAddresses) {
//                if (inetAddress instanceof java.net.Inet6Address) {
//                    System.out.println("IPv6 address: " + inetAddress.getHostAddress());
//                }
//            }
//        } catch (UnknownHostException ex) {
//            System.out.println("Could not resolve hostname");
//        }
        try {
            InetAddress[] addresses = InetAddress.getAllByName("apple.com");
            for (InetAddress addr : addresses) {
                if (addr instanceof Inet4Address) {
                    System.out.println("IPv4 Address: " + addr.getHostAddress());
                } else if (addr instanceof Inet6Address) {
                    System.out.println("IPv6 Address: " + addr.getHostAddress());
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not find IP address for apple.com");
        }
    }
}

