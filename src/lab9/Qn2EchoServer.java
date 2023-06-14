package lab9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Qn2EchoServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(7090);

            while (true){
                try{
                    Socket socket = server.accept();

                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream());
                    String clientMsg = in.readLine();
                    out.println(clientMsg);

                    in.close();
                    out.close();
                    socket.close();
                }catch (IOException e){
                    System.out.println(e);
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
