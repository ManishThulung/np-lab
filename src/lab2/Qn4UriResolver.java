// Manish Rai
// 18
package lab2;
import java.net.URI;
import java.net.URISyntaxException;
public class Qn4UriResolver {
    public static void main(String[] args) {
        String baseUri = "https://kathford.edu.np/about-us/";
        String relativeUri = "/kathford-scholarships";
        String resolvedUri = resolveUri(baseUri, relativeUri);
        System.out.println(resolvedUri);
    }
    private static String resolveUri(String baseUri, String relativeUri) {
        try {
            URI base = new URI(baseUri);
            URI resolved = base.resolve(relativeUri);
            return resolved.toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }
}