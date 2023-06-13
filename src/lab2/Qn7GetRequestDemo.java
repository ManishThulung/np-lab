// Manish Rai
// 18
package lab2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
public class Qn7GetRequestDemo {
    public static void main(String[] args) {
        String name = "John Smith";
        String encodedName = URLEncoder.encode(name);
        String urlString = "http://kathford.edu.np/server-side-program.php?name=" + encodedName;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            System.out.println("Response from server: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
