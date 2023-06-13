package lab4;
import java.net.*;
public class Qn4ServerSecurity {
    public static void main(String[] args) {
        try {
            URL url1 = new URL("https://kathford.edu.np/contact-us/");
            URLConnection conn1 = url1.openConnection();
            System.out.println("Security permissions of " + url1.getHost() + ": " + conn1.getPermission());
            URL url2 = new URL("https://kathford.edu.np/");
            URLConnection conn2 = url2.openConnection();
            System.out.println("Security permissions of " + url2.getHost() + ": " + conn2.getPermission());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
