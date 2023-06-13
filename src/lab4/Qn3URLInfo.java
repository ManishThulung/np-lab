// Manish Rai
// 18
package lab4;
import java.net.*;
import java.util.*;
public class Qn3URLInfo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://kathford.edu.np/");
            URLConnection conn = url.openConnection();
            System.out.println("Content-Type: " + conn.getContentType());
            System.out.println("Content-Length: " + conn.getContentLength());
            System.out.println("Last-Modified: " + new Date(conn.getLastModified()));
            System.out.println("Date: " + new Date(conn.getDate()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
