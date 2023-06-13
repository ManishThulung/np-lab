// Manish Rai
// 18
package lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class Qn3WebPageDownloader {
    public static void main(String[] args) {
        String urlString = "https://www.deerwalk.edu.np"; // Replace with your desired URL
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error downloading web page: " + e.getMessage());
        }
    }
}