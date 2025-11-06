package questions;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("Localhost", 5000);
            System.out.println("Connected to server");
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a message to send :");
            String message = consoleInput.readLine();
            output.println(message);
            System.out.println("Message sent");
            output.close();
            consoleInput.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
