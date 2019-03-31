package com.github.nadal.java.io;

import org.junit.Test;

import java.io.File;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class TestDiskOperators {
    @Test
    public void testListAllFiles() {
        DiskOperators.listAllFiles(new File("/Users/lukong/netease-projects/leetcode-ac"));
    }
}
