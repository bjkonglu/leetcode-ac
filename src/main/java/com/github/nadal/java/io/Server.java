package com.github.nadal.java.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();

            // read from socket
            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // write to socket
            OutputStream out = socket.getOutputStream();
            out.write("hello client".getBytes());
            out.flush();
            out.close();
            bufferedReader.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
