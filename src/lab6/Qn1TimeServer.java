package lab6;

import java.io.*;
import java.net.*;
import java.util.Date;
import java.text.*;

public class Qn1TimeServer {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(8056);

            while (true){
                try{
                    Socket conn = server.accept();
                    PrintWriter out = new PrintWriter(conn.getOutputStream(), true);
                    Date now = new Date();
                    out.println(now.toString()+"\r\n");
                    out.close();
                    conn.close();
                } catch (IOException e){
                    System.out.println(e);
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
