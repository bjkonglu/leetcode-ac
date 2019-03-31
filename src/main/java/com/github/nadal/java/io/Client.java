package com.github.nadal.java.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);

            // write to socket
            OutputStream out = socket.getOutputStream();
            out.write("hello server".getBytes());
            out.flush();
            socket.shutdownOutput();

            // read from socket
            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
