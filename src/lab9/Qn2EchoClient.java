package lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Qn2EchoClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",7090);
//            InputStreamReader reader = new InputStreamReader(socket.getInputStream());

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String messageToSend = "Hello, server!";
            out.println(messageToSend);

            String serverResponse = in.readLine();
            System.out.println("Server response: " + serverResponse);

            out.close();
            in.close();
            socket.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
