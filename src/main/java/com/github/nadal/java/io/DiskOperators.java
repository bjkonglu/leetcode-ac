package com.github.nadal.java.io;

import java.io.File;
import java.util.Objects;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class DiskOperators {

    public static void listAllFiles(File file) {
        if (file == null || !file.exists()) return;
        if (file.isFile()) {
            System.out.println(file.getName());
        } else {
            for (File childFile: Objects.requireNonNull(file.listFiles())) {
                listAllFiles(childFile);
            }
        }
    }
}
