// Manish Rai
package lab3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Qn1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("OPTIONS");
        connection.connect();
        String methods = connection.getHeaderField("Allow");
        System.out.println("Supported Methods: " + methods);
    }
}
