// Manish Rai
// 18
package lab2;
import java.net.MalformedURLException;
import java.net.URL;
public class Qn2ProtocolChecker {
    public static void main(String[] args) {
        String[] protocols = { "http", "https", "ftp", "telnet", "mailto", "gopher" };
        for (String protocol : protocols) {
            if (isProtocolSupported(protocol)) {
                System.out.println(protocol + " protocol is supported");
            } else {
                System.out.println(protocol + " protocol is not supported");
            }
        }
    }
    private static boolean isProtocolSupported(String protocol) {
        try {
            URL url = new URL(protocol, "kathford.edu.np", "");
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }
}