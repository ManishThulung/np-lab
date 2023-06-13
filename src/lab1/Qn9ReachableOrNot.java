// Manish Rai
// 18
package lab1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Qn9ReachableOrNot {
    public static void main(String[] args) {
        String hostname = "www.facebook.com";
        try {
            InetAddress inetAddress = InetAddress.getByName(hostname);
            boolean reachable = inetAddress.isReachable(5000);
            if (reachable) {
                System.out.println(hostname + " is reachable.");
            } else {
                System.out.println(hostname + " is not reachable.");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
