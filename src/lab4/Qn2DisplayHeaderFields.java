// Manish Rai
// 18
package lab4;
import java.net.*;
import java.util.*;
public class Qn2DisplayHeaderFields {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://kathford.edu.np/");
            URLConnection conn = url.openConnection();
            Map<String, List<String>> headers = conn.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.println(key + ": " + values);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
