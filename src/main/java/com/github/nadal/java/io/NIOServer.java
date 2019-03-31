package com.github.nadal.java.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class NIOServer {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(9999));

        while (true) {
            selector.select();
            Set<SelectionKey> keySet = selector.selectedKeys();
            Iterator iterator = keySet.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = (SelectionKey) iterator.next();
                if (key.isAcceptable()) {
                    ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                    SocketChannel sc = ssc.accept();
                    sc.configureBlocking(false);

                    sc.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    SocketChannel sc = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10*1024);
                    StringBuilder str = new StringBuilder();

                    while (true) {
                        int ret = sc.read(byteBuffer);
                        if (ret == -1) break;
                        byteBuffer.flip();
                        int limit = byteBuffer.limit();
                        char[] chrs = new char[limit];
                        
                        for (int i=0; i<limit; i++) {
                            chrs[i] = (char) byteBuffer.get(i);
                        }
                        str.append(chrs);
                        byteBuffer.clear();
                    }
                    System.out.println(str.toString());

                    sc.close();
                }
                iterator.remove();
            }
        }
    }
}
