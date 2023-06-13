package lab4;
import java.net.*;
public class Qn5GuessMimeType {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://kathford.edu.np/");
            URL img = new URL("https://kathford.edu.np/wp-content/uploads/2019/08/Kathford-Logo-01-small-e1565634719752.png");
            URLConnection conn = url.openConnection();
            String contentType = conn.getContentType();
            URLConnection conn1 = img.openConnection();
            String contentType1 = conn1.getContentType();
            if (contentType != null) {
                System.out.println("MIME type: " + contentType);
            }
            if (contentType1 != null) {
                System.out.println("MIME type of png: " + contentType);
            }else {
                System.out.println("Unable to guess MIME type.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
