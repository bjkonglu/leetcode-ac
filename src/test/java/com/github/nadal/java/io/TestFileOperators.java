package com.github.nadal.java.io;

import org.junit.Test;

import java.io.IOException;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class TestFileOperators {

    @Test
    public void testCopyFile() throws IOException {
        String srcPath = "/Users/lukong/netease-projects/leetcode-ac/src/main/java/com/github/nadal/java/io/DiskOperators.java";
        String distPath = "/Users/lukong/netease-projects/leetcode-ac/cp";
        FileOperators.copyFile(srcPath, distPath);
    }

    @Test
    public void testFastCopy() throws IOException {
        String srcPath = "/Users/lukong/netease-projects/leetcode-ac/src/main/java/com/github/nadal/java/io/DiskOperators.java";
        String distPath = "/Users/lukong/netease-projects/leetcode-ac/cp";
        FileOperators.fastCopy(srcPath, distPath);
    }
}
