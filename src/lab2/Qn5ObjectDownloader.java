// Manish Rai
// 18
package lab2;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
public class Qn5ObjectDownloader {
    public static void main(String[] args) {
        String objectUrl = "https://kathford.edu.np/wp-content/uploads/2019/05/kath-log.svg";
        String filename = "kath-log.svg";
        downloadObject(objectUrl, filename);
    }
    private static void downloadObject(String objectUrl, String filename) {
        try {
            URL url = new URL(objectUrl);
            InputStream in = url.openStream();
            FileOutputStream out = new FileOutputStream(filename);
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            in.close();
            out.close();
            System.out.println("Object downloaded successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
