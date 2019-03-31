package com.github.nadal.java.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class NIOClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream out = socket.getOutputStream();
        String s = "hello world";
        out.write(s.getBytes());
        out.close();
    }
}
