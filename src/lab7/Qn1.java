package lab7;

import java.io.*;
import java.net.Socket;

public class Qn1 {
    public static void main(String[] args) {
        String serverAddress = "tu.edu.np";
        int serverPort = 80;
        String filePath = "/";
        String outputFile = "downloaded_content.txt";

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            OutputStream outputStream = socket.getOutputStream();

            PrintWriter requestWriter = new PrintWriter(outputStream, true);
            requestWriter.println("GET " + filePath + " HTTP/1.1");
            requestWriter.println("Host: " + serverAddress);
            requestWriter.println("Connection: close");
            requestWriter.println();

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));

            InputStream inputStream = socket.getInputStream();
            BufferedReader responseReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = responseReader.readLine()) != null) {
                fileWriter.write(line);
                fileWriter.newLine();
            }

            fileWriter.close();
            responseReader.close();
            socket.close();

            System.out.println("Content downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}