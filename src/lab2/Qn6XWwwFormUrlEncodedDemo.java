package lab2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
public class Qn6XWwwFormUrlEncodedDemo {
    public static void main(String[] args) {
        try{
            System. out.println (URLEncoder. encode ("This string has space", "UTF-8"));
            System. out.println (URLEncoder. encode ("This string has asterisks", "UTF-8"));
            System.out.println (URLEncoder. encode ("This string has percent", "UTF-8")) ;
            System.out.println (URLEncoder. encode ("This string has percent", "UTF-8")) ;
        } catch (UnsupportedEncodingException ex){
            throw new RuntimeException ("Broken does not support utf-8");
        }
    }
}
