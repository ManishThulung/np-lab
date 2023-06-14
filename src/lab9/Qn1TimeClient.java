package lab9;

import java.io.*;
import java.net.*;

public class Qn1TimeClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8056);
            socket.setSoTimeout(20000);
            InputStream in = socket.getInputStream();
            Reader reader = new InputStreamReader(in);
            StringBuilder builder = new StringBuilder();

            for (int c = reader.read(); c != -1; c = reader.read()){
                builder.append((char) c);
            }
            System.out.println(builder);
            socket.close();
        } catch (IOException e){
            System.out.println(e);
        }

    }
}
