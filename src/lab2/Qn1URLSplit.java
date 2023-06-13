// Manish Rai
// 18
package lab2;
import java.net.URI;
import java.net.URISyntaxException;
public class Qn1URLSplit {
    public static void main(String[] args) {
        String url = "https://www.google.com/search?q=image&tbm=isch&ved=2ahUKEwj827nasvb3AhV";
        try {
            URI uri = new URI(url);
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
        } catch (URISyntaxException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
