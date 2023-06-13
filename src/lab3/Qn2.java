// Manish Rai
package lab3;
import java.net.*;

public class Qn2 implements CookiePolicy {
    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        if(cookie.getDomain() != null && cookie.getDomain().endsWith(".edu.np")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CookieHandler.setDefault(new CookieManager(null, new Qn2()));
        try {
            URL url = new URL("https://www.kathford.edu.np");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            System.out.println("Response code: " + con.getResponseCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
