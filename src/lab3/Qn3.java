// Manish Rai
package lab3;
import java.net.*;
import java.util.*;
public class Qn3 implements CookieStore {
    private Map<URI, List<HttpCookie>> cookieJar = new HashMap<>();
    @Override
    public void add(URI uri, HttpCookie cookie) {
        List<HttpCookie> cookies = cookieJar.getOrDefault(uri, new ArrayList<>());
        cookies.add(cookie);
        cookieJar.put(uri, cookies);
    }

    @Override
    public List<HttpCookie> get(URI uri) {
        List<HttpCookie> cookies = cookieJar.get(uri);
        if (cookies == null) {
            cookies = new ArrayList<>();
        }
        return cookies;
    }

    @Override
    public List<HttpCookie> getCookies() {
        List<HttpCookie> cookies = new ArrayList<>();
        for (URI uri : cookieJar.keySet()) {
            cookies.addAll(cookieJar.get(uri));
        }
        return cookies;
    }

    @Override
    public List<URI> getURIs() {
        return new ArrayList<>(cookieJar.keySet());
    }

    @Override
    public boolean remove(URI uri, HttpCookie cookie) {
        List<HttpCookie> cookies = cookieJar.get(uri);
        if (cookies != null && cookies.remove(cookie)) {
            cookieJar.put(uri, cookies);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll() {
        if (!cookieJar.isEmpty()) {
            cookieJar.clear();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a new cookie store
        CookieManager cookieManager = new CookieManager(new Qn3(), CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(cookieManager);

        // Make a request to a website to receive some cookies
        try {
            URL url = new URL("https://www.example.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            System.out.println("Cookies received: " + cookieManager.getCookieStore().getCookies());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Remove all cookies from the store
        cookieManager.getCookieStore().removeAll();
        System.out.println("Cookies after removal: " + cookieManager.getCookieStore().getCookies());
    }
}

