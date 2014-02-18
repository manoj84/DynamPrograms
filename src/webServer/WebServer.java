/**
 * This is an implementation of multi-threaded web server
 */

package webServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String args[]) {
        int port = 6790;

        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(port);
                System.out.println("listeninig....");

                // Get the connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to the Client...");

                HttpRequest request = new HttpRequest(clientSocket);

                Thread thread = new Thread(request);
                thread.start();

                serverSocket.close();
                clientSocket.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

final class HttpRequest implements Runnable {

    private Socket socket = null;
    final static String CRLF = "\r\n";

    public HttpRequest(Socket s) {
        this.socket = s;
    }

    @Override
    public void run() {

        try {
            processRequest(socket);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void processRequest(Socket socket) throws Exception {

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));

    }
}
