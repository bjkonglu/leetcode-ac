package com.github.nadal.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class FileOperators {

    public static void copyFile(String srcPath, String distPath) throws IOException {
        FileInputStream in = new FileInputStream(srcPath);
        FileOutputStream out = new FileOutputStream(distPath);

        byte[] buffer = new byte[20 * 1024];
        int cnt;

        while((cnt = in.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, cnt);
        }

        in.close();
        out.close();
    }

    public static void fastCopy(String srcPath, String distPath) throws IOException {
        FileInputStream in = new FileInputStream(srcPath);
        FileChannel fcin = in.getChannel();

        FileOutputStream out = new FileOutputStream(distPath);
        FileChannel fcout = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        while (true) {
            int ret = fcin.read(buffer);
            if (ret == -1) break;

            buffer.flip();

            fcout.write(buffer);
            buffer.clear();
        }
    }
}
