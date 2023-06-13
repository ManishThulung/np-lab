package lab7;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Qn2 {

    public static void main(String[] args) {
        int port = 8080;
        String keystorePath = "server.keystore";
        String keystorePassword = "password";

        try {
            System.setProperty("javax.net.ssl.keyStore", keystorePath);
            System.setProperty("javax.net.ssl.keyStorePassword", keystorePassword);

            SSLServerSocketFactory socketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket serverSocket = (SSLServerSocket) socketFactory.createServerSocket(port);

            System.out.println("Time server started. Listening on port " + port);

            while (true) {
                SSLSocket clientSocket = (SSLSocket) serverSocket.accept();

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // Get the current time
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentTime = sdf.format(new Date());

                // Send the current time to the client
                out.println(currentTime);

                out.close();
                in.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

