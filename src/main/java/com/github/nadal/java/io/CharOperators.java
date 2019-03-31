package com.github.nadal.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class CharOperators {

    public static void readFileContent(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
