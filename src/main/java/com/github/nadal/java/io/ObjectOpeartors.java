package com.github.nadal.java.io;

import java.io.*;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class ObjectOpeartors {

    public static class A implements Serializable {
        private int x;
        private String y;

        A(int x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x=" + x + ", y=" + y;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A(1, "y");
        String file = "/Users/lukong/netease-projects/leetcode-ac/obj";

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(a);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        A b = (A) in.readObject();

        System.out.println(b.toString());
    }
}
