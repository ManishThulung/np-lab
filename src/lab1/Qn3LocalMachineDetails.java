// Manish Rai
// 18
package lab1;

import java.net.*;

public class Qn3LocalMachineDetails {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Name of the local machine: " + address.getHostName());
            System.out.println("IP address of the local machine: " + address.getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println("Could not find local machine");
        }
    }
}
