// Manish Rai
// 18
package lab4;
import java.net.*;
import java.io.*;
public class Qn1DownloadWebpage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();
            InputStream in = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
